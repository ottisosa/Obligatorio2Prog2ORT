package dominio;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

public abstract class Persona {
    protected String nombre;
    protected String ci;
    protected String celular;

    public Persona(String nombre, String ci, String celular) {
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

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
