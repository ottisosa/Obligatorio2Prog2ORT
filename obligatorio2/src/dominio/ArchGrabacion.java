package dominio;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

public class ArchGrabacion {
    private Formatter out;
    
    public ArchGrabacion(String nom){
        try{
            out = new Formatter(nom);
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error al crear el archivo de CV", "ERROR", 0);
        }
    }
    
    public ArchGrabacion(String nom, boolean extender){
        try{
            FileWriter f = new FileWriter(nom, extender);
            out = new Formatter(f);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error al crear el archivo de CV", "ERROR", 0);
        }
    }
    
    public void grabarLinea(String linea){
        out.format("%s%n", linea);
    }
    
    public void cerrar(){
        out.close();
    }
}
