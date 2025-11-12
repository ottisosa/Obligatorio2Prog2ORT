package dominio;


// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

import interfaz.SplashScreen;
public class Obligatorio2 {

   
    public static void main(String[] args) {
        
        String n = "HOLAAAAA";
        Sistema sistema = new Sistema();
        if(sistema.equals(n)){
            System.out.println("funciona");
        }
        else{
            System.out.println("Funciona");
        }
        SplashScreen splash = new SplashScreen(sistema);
    
    }
    
}
