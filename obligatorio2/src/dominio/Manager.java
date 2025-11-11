package dominio;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

public class Manager extends Persona{
    private int antiguedad;

    public Manager(int antiguedad, String nombre, String ci, String celular, Sistema sistema) {
        super(nombre, ci, celular, sistema);
        this.antiguedad = antiguedad;
        
        this.modelo.addListaManagers(this);
    }
    
    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}
