package dominio;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)
import java.util.*;

public class Sistema {

    private ArrayList<Persona> listaPersonas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Manager> listaManagers;
    private ArrayList<Area> listaAreas;

    public Sistema(ArrayList<Persona> listaPersonas, ArrayList<Empleado> listaEmpleados, ArrayList<Manager> listaManagers, ArrayList<Area> listaAreas) {
        this.listaPersonas = listaPersonas;
        this.listaEmpleados = listaEmpleados;
        this.listaManagers = listaManagers;
        this.listaAreas = listaAreas;
    }

    public Sistema() {
        this.listaPersonas = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
        this.listaManagers = new ArrayList<>();
        this.listaAreas = new ArrayList<>();
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void addListaPersonas(Persona persona) {
        this.listaPersonas.add(persona);
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void addListaEmpleados(Empleado empleado) {
        this.listaEmpleados.add(empleado);
    }

    public ArrayList<Manager> getListaManagers() {
        return listaManagers;
    }

    public void addListaManagers(Manager manager) {
        this.listaManagers.add(manager);
    }

    public ArrayList<Area> getListaAreas() {
        return listaAreas;
    }

    public void addListaAreas(Area area) {
        this.listaAreas.add(area);
    }

    public void ordenarAreaPorNombre() {

        Collections.sort(listaAreas);

    }


}
