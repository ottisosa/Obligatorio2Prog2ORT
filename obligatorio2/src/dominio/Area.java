
// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

package dominio;
public class Area implements Comparable<Area> {

    private String nombre;
    private String descripcion;
    private int presupuesto;
    private Sistema modelo;

    public Area(String nombre, String descripcion, int presupuesto, Sistema sistema) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.presupuesto = presupuesto;
        this.modelo = sistema;
        this.modelo.addListaAreas(this);
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

    @Override
    public String toString() {
        return this.nombre;
    }
    
    
    @Override
    
    // criterio por defecto para ordenar por nombre
    
    public int compareTo(Area o) {
        return this.getNombre().compareTo(this.getNombre());
    }

}
