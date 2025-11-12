// Autores: Santiago Quintana (327886), Octavio Sosa (363131)
package dominio;

import java.util.*;

public class Sistema extends Observable {

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
        this.setChanged();
        this.notifyObservers();
    }

    public ArrayList<Manager> getListaManagers() {
        return listaManagers;
    }

    public void addListaManagers(Manager manager) {
        this.listaManagers.add(manager);
        this.setChanged();
        this.notifyObservers();
    }

    public void eliminarListaManagers(Manager manager) {
        this.listaManagers.remove(manager);
        this.setChanged();
        this.notifyObservers();
    }

    public ArrayList<Area> getListaAreas() {
        this.ordenarAreaPorNombre(this.listaAreas);
        return listaAreas;
    }

    public void addListaAreas(Area area) {
        this.listaAreas.add(area);
        this.setChanged();
        this.notifyObservers();
    }

    public void eliminarListaAreas(Area area) {
        this.listaAreas.remove(area);
        this.setChanged();
        this.notifyObservers();
    }

    public void modificacionArea() {

        this.setChanged();
        this.notifyObservers();

    }

    public boolean verificarNombreArea(String nombre) {
        boolean esta = false;
        for (int i = 0; i < this.listaAreas.size(); i++) {
            if (this.listaAreas.get(i).getNombre().equals(nombre)) {
                esta = true;
            }
        }
        return esta;
    }

    public ArrayList<Area> getListaAreasSinEmp() {
        ArrayList<Area> arSinEmp = new ArrayList<>();
        for (int i = 0; i < this.listaAreas.size(); i++) {
            boolean esta = false;
            for (int j = 0; j < this.listaEmpleados.size(); j++) {
                if (this.listaAreas.get(i) == this.listaEmpleados.get(j).getArea()) {
                    esta = true;
                }
            }
            if (!esta) {
                arSinEmp.add(this.listaAreas.get(i));
            }
        }
        this.ordenarAreaPorNombre(arSinEmp);
        return arSinEmp;
    }

    public void ordenarAreaPorNombre(ArrayList<Area> listaArea) {
        Collections.sort(listaArea);
    }

}
