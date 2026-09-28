//@author emman
package entity;
public class Reservacion {
    
    private String cliente;
    private String tipoCuarto;
    private String fechaReserva;
    private int cantidadDias;
    private double precio;
    private double aumento;
    private double total;       

    public Reservacion() {
    }

    public Reservacion(String cliente, String tipoCuarto, String fechaReserva, int cantidadDias, double precio, double aumento, double total) {
        this.cliente = cliente;
        this.tipoCuarto = tipoCuarto;
        this.fechaReserva = fechaReserva;
        this.cantidadDias = cantidadDias;
        this.precio = precio;
        this.aumento = aumento;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipoCuarto() {
        return tipoCuarto;
    }

    public void setTipoCuarto(String tipoCuarto) {
        this.tipoCuarto = tipoCuarto;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getAumento() {
        return aumento;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
