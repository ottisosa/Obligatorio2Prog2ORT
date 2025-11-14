package dominio;
import java.io.*;
import java.util.*;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

public class ArchLectura {
    private Scanner in;
    private String linea;
    
    public ArchLectura(String nom){
        try{
            in = new Scanner(Paths.get(nom));
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error al abrir el CV", "ERROR", 0);
        }
    }
    
    public boolean hayMasLineas(){
        boolean hay = false;
        this.linea = null;
        if(in.hasNext()){
            this.linea = in.nextLine();
            hay = true;
        }
        return hay;
    }
    
    public String linea(){
        return this.linea;
    }
    
    public void cerrar(){
        in.close();
    }
    
}
