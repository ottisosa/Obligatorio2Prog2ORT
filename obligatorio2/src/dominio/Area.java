
// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

package dominio;
public class Area implements Comparable<Area> {

    private String nombre;
    private String descripcion;
    private long presupuesto;
    private long prosupuestoTotal;
    private Sistema modelo;

    public Area(String nombre, String descripcion, long presupuesto, long prosupuestoTotal, Sistema sistema) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.presupuesto = presupuesto;
        this.prosupuestoTotal = presupuesto; 
        this.modelo = sistema;
        this.modelo.addListaAreas(this);
    }

    public String getNombre() {
        return nombre;
    }

    public long getProsupuestoTotal() {
        return prosupuestoTotal;
    }

    public void setProsupuestoTotal(long prosupuestoTotal) {
        this.prosupuestoTotal = prosupuestoTotal;
    }

    public Sistema getModelo() {
        return modelo;
    }

    public void setModelo(Sistema modelo) {
        this.modelo = modelo;
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

    public long getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(long presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public long porcentajeP(long prosupuesto, long prosupuestoTotal){
        
        return prosupuesto/prosupuestoTotal * 100;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    
    @Override
    
    // criterio por defecto para ordenar por nombre
    
    public int compareTo(Area area) {
        return this.getNombre().toUpperCase().compareTo(area.getNombre().toUpperCase());
    }
    
    

}
