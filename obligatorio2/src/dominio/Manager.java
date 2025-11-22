package dominio;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

import java.io.Serializable;

public class Manager extends Persona implements Comparable<Manager>, Serializable {

    private int antiguedad;

    public Manager(int antiguedad, String nombre, String ci, String celular, Sistema sistema) {
        super(nombre, ci, celular, sistema);
        this.antiguedad = antiguedad;

        this.modelo.addListaManagers(this);
    }

    
    public int getAntiguedad() {
        return antiguedad;
    }

    
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    
    // Criterio por defecto ordenar por antiguedad
    
    public int compareTo(Manager man) {
        return man.getAntiguedad() - this.getAntiguedad();
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    
}
