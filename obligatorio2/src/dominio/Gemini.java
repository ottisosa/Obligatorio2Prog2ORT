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
        String nomCV = "/CV"+emp.getCi()+".txt";
        File dirCV = new File(System.getProperty("user.dir")+File.separator+"CVs"+nomCV);
        if(dirCV.exists()){
            ArchLectura arch = new ArchLectura(nomCV);
            String cv = "";
            while(arch.hayMasLineas()){
                cv += arch.linea();
            }
            arch.cerrar();
        }
        else{
            JOptionPane.showMessageDialog(null, "No se pudo abrir el CV del empleado", "ERROR", 0);
        }
    }

}
