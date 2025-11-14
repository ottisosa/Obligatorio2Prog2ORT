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
        this.ordenarEmpleadoPorSalario(this.listaEmpleados);
        return this.listaEmpleados;
    }

    public void addListaEmpleados(Empleado empleado) {
        this.listaEmpleados.add(empleado);
        this.setChanged();
        this.notifyObservers();
    }

    public ArrayList<Manager> getListaManagers() {

        this.ordenarManagerPorAntiguedad(this.listaManagers);

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

    public void modificacion() {
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

    public boolean verificarCedula(String ci) {

        boolean esta = false;

        for (int i = 0; i < this.listaPersonas.size(); i++) {
            if (this.listaPersonas.get(i).getCi().equals(ci)) {
                esta = true;
            }
        }
        return esta;

    }

    public int empACargo(Manager man) {

        int cantidad = 0;

        for (int i = 0; i < this.listaEmpleados.size(); i++) {

            if (this.listaEmpleados.get(i).getManager().nombre.equals(man.getNombre())) {

                cantidad += 1;
            }

        }

        return cantidad;
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

    public void ordenarManagerPorAntiguedad(ArrayList<Manager> listaManagers) {

        Collections.sort(listaManagers);
    }

    public void ordenarEmpleadoPorSalario(ArrayList<Empleado> listaEmpleados) {
        Collections.sort(listaEmpleados);
    }

}
