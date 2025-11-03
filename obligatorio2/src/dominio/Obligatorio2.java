package dominio;
import interfaz.*;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

import interfaz.SplashScreen;
public class Obligatorio2 {

   
    public static void main(String[] args) {
        
        SplashScreen splash = new SplashScreen();
        splash.setVisible(true);
        try{
            Thread.sleep(4000);
        }
        catch(InterruptedException e){
        }
        splash.dispose();
        
        
    }
    
}
