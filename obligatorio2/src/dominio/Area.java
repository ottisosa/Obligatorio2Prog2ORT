package dominio;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)
public class Area {

    private String nombre;
    private String descripcion;
    private int presupuesto;

    public Area(String nombre, String descripcion, int presupuesto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }


}
