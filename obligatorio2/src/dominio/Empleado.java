package dominio;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

public class Empleado extends Persona{
    private int salario;
    private Manager manager;
    private Area area;

    public Empleado(int salario, Manager manager, Area area, String nombre, String ci, String celular) {
        super(nombre, ci, celular);
        this.salario = salario;
        this.manager = manager;
        this.area = area;
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
}
