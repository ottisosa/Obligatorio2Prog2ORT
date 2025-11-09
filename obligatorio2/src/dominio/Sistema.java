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

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Manager> getListaManagers() {
        return listaManagers;
    }

    public void setListaManagers(ArrayList<Manager> listaManagers) {
        this.listaManagers = listaManagers;
    }

    public ArrayList<Area> getListaAreas() {
        return listaAreas;
    }

    public void setListaAreas(ArrayList<Area> listaAreas) {
        this.listaAreas = listaAreas;
    }

    public void ordenarAreaPorNombre() {

        Collections.sort(listaAreas, new criterioNombre());

    }

    private class criterioNombre implements Comparator<Area> {

        @Override
        public int compare(Area area1, Area area2) {
            return area1.getNombre().toUpperCase().compareTo(area2.getNombre().toUpperCase());
        }
    }
}
