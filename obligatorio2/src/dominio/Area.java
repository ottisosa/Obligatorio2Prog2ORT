// Autores: Santiago Quintana (327886), Octavio Sosa (363131)
package dominio;

public class Area implements Comparable<Area> {

    private String nombre;
    private String descripcion;
    private int presupuesto;
    private int presupuestoTotal;
    private Sistema modelo;

    public Area(String nombre, String descripcion, int presupuesto, Sistema sistema) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.presupuesto = presupuesto;
        this.presupuestoTotal = presupuesto;
        this.modelo = sistema;
        this.modelo.addListaAreas(this);
    }

    public String getNombre() {
        return nombre;
    }

    public int getProsupuestoTotal() {
        return presupuestoTotal;
    }

    public void setProsupuestoTotal(int presupuestoTotal) {
        this.presupuestoTotal = presupuestoTotal;
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

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
        
        
    }

    public int getPorcentaje() {

        return (( (presupuestoTotal - presupuesto) / presupuestoTotal) * 100);
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
