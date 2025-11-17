package dominio;

public class Movimiento {
    private String mes;
    private Empleado emp;
    private Area origen;
    private Area destino;

    public Movimiento(String mes, Empleado emp, Area origen, Area destino) {
        this.mes = mes;
        this.emp = emp;
        this.origen = origen;
        this.destino = destino;
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
    
    
}
