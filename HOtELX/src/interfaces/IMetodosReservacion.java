package interfaces;

public interface IMetodosReservacion {
    public double hallarPrecio(String tipoCuarto);
    public double hallarAumento(double precio, String fechaReserva);
    public double hallarTotal(double precio, double aumento, int cantidadDias);
}