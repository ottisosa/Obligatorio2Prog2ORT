package dominio;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

public class Empleado extends Persona implements Comparable<Empleado>{
    private int salario;
    private Manager manager;
    private Area area;

    public Empleado(int salario, Manager manager, Area area, String nombre, String ci, String celular, Sistema sistema) {
        super(nombre, ci, celular, sistema);
        this.salario = salario;
        this.manager = manager;
        this.area = area;
        
        this.modelo.addListaEmpleados(this);
    }
    
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    @Override
    public int compareTo(Empleado emp){
        return this.salario - emp.salario;
    }
}
