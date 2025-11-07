package dominio;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

public abstract class Persona {
    protected String nombre;
    protected int ci;
    protected int celular;

    public Persona(String nombre, int ci, int celular) {
        this.nombre = nombre;
        this.ci = ci;
        this.celular = celular;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
}
