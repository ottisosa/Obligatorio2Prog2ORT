package dominio;

public class Movimiento implements Comparable<Movimiento>{
    private String mes;
    private int nroMes;
    private Empleado emp;
    private Area origen;
    private Area destino;
    private Sistema modelo;

    public Movimiento(String mes, int nroMes, Empleado emp, Area origen, Area destino, Sistema sis) {
        this.mes = mes;
        this.nroMes = nroMes;
        this.emp = emp;
        this.origen = origen;
        this.destino = destino;
        this.modelo = sis;
        this.modelo.addListaMovimientos(this);
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }

    public Area getOrigen() {
        return origen;
    }

    public void setOrigen(Area origen) {
        this.origen = origen;
    }

    public Area getDestino() {
        return destino;
    }

    public void setDestino(Area destino) {
        this.destino = destino;
    }

    public int getNroMes() {
        return nroMes;
    }

    public void setNroMes(int nroMes) {
        this.nroMes = nroMes;
    }
    
    @Override
    public int compareTo(Movimiento mov) {
        return this.nroMes - mov.getNroMes();
    }
}
