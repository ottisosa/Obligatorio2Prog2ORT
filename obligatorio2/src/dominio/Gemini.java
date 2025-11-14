package dominio;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dominio.*;
import java.io.File;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import javax.swing.JOptionPane;
// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

public class Gemini {
    private static final String MODEL_NAME = "gemini-2.5-flash";
    private static final String API_URL_BASE = "https://generativelanguage.googleapis.com/v1beta/models/";

    private final HttpClient httpClient;
    private final Gson gson;
    private final String apiKey;
    
    public Gemini(){
        this.httpClient = HttpClient.newHttpClient();
        this.gson = new Gson();
        
        this.apiKey = System.getenv("ERP_API_KEY");
        if(this.apiKey == null || this.apiKey.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Variable de entorno ERP_API_KEY no esta configurada", "ERROR", 0);
        }
    }
    
    private String construirPrompt(Area origen, Area destino, Empleado emp){
        String resp = "";
        
        String nomCV = "/CV"+emp.getCi()+".txt";
        File dirCV = new File(System.getProperty("user.dir")+File.separator+"CVs"+nomCV);
        if(dirCV.exists()){
            ArchLectura arch = new ArchLectura(nomCV);
            String cv = "";
            while(arch.hayMasLineas()){
                cv += arch.linea();
            }
            arch.cerrar();
            
            String nomEmp = emp.getNombre();
            String salEmp = ""+emp.getSalario();
            
            String nomOrigen = origen.getNombre();
            String descOrigen = origen.getDescripcion();
            String presOrigen = ""+origen.getPresupuesto();
            
            String nomDestino = destino.getNombre();
            String descDestino = destino.getDescripcion();
            String presDestino = ""+destino.getPresupuesto();
            
            resp = String.format(
                    """
                    Eres un asistente experto de Recursos Humanos.
                    Analiza el siguiente movimiento de personal y proporciona un reporte conciso de ventajas y desventajas.

                    EMPLEADO:
                    - Nombre: %s
                    - Salario Mensual: %s
                    - CV: %s

                    ÁREA DE ORIGEN:
                    - Nombre: %s
                    - Descripción: %s
                    - Presupuesto anual: %s
                    

                    ÁREA DE DESTINO:
                    - Nombre: %s
                    - Descripción: %s
                    - Presupuesto anual: %s

                    INFO ADICIONAL A TENER EN CUENTA:
                    - Cuando el empleado se transfiere, el salario mensual del empleado se vuelve a agregar al presupuesto del area de origen 
                    (si el empleado se transfiere no hay que pagarle),y se resta al presupuesto del area de destino (le tiene que pagar a su 
                    nuevo empleado). 
                    -El mes de la transferencia del empleado es desconocido (es importante porque al transferir el empleado en cierto mes se 
                    agrega al presupuesto del area original y se resta del area de destino solo el salario de los meses restantes del año).
                    
                    
                    IMPORTANTE - FORMATO DEL REPORTE:
                    solamente debe redactar el reporte con el siguiente formato entre comillas('), con libertad para desarrollar lo pedido entre asteriscos (*):
                    ' REPORTE INTELIGENTE
                    *describir movimiento a realizar*
                    Ventajas: 
                    *lista de ventajas*
                    Desventajas:
                    *lista de desventajas*
                    Conclusion:
                    *breve conclusion sobre si se deberia realizar o no el movimiento* '
                    
            """, nomEmp, salEmp, cv, nomOrigen, descOrigen, presOrigen, nomDestino, descDestino, presDestino);
        }
        else{
            JOptionPane.showMessageDialog(null, "No se pudo abrir el CV del empleado", "ERROR", 0);
        }
        
        return resp;
    }
    
    private String construirCuerpoJson(String prompt){
        JsonObject textPart = new JsonObject();
        textPart.addProperty("text", prompt);

        JsonArray partsArray = new JsonArray();
        partsArray.add(textPart);

        JsonObject content = new JsonObject();
        content.add("parts", partsArray);

        JsonArray contentsArray = new JsonArray();
        contentsArray.add(content);

        JsonObject root = new JsonObject();
        root.add("contents", contentsArray);

        return gson.toJson(root);
    }
    
    private String parsearRespuesta(String jsonResponse){
        String resp = "";
        try{
            JsonObject root = JsonParser.parseString(jsonResponse).getAsJsonObject();
            
            resp = root.getAsJsonArray("candidates")
                    .get(0).getAsJsonObject()
                    .get("content").getAsJsonObject()
                    .get("parts").getAsJsonArray()
                    .get(0).getAsJsonObject()
                    .get("text").getAsString();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al parsear JSON de Gemini", "ERROR", 0);
            resp = "Error al procesar la respuesta del modelo";
        }
        return resp;
    }
    
    public String generarReporte(Area origen, Area destino, Empleado emp) throws Exception{
        String prompt = this.construirPrompt(origen, destino, emp);
        String jsonBody = this.construirCuerpoJson(prompt);
        
        String apiUrl = API_URL_BASE + MODEL_NAME + ":generateContent?key=" + this.apiKey;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();
        
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        
        if (response.statusCode() != 200) {
            throw new RuntimeException("Error en la API de Gemini: " + response.body());
        }
        
        return this.parsearRespuesta(response.body());
    }
    

}
