package entity;

import interfaces.IMetodosReservacion;

public class MetodosReservacion implements IMetodosReservacion {

    @Override
    public double hallarPrecio(String tipoCuarto) {
        switch (tipoCuarto) {
            case "Simple":  return 140;
            case "Doble":   return 290;
            case "Premium": return 500;
            default:        return 0;
        }
    }

    @Override
    public double hallarAumento(double precio, String fechaReserva) {
        int mes = Integer.parseInt(fechaReserva.substring(3, 5));
        if (mes == 1 || mes == 12) return precio * 0.50; // enero o diciembre 50%
        if (mes == 11 || mes == 2) return precio * 0.20; // noviembre o febrero 20%
        return 0;
    }

    @Override
    public double hallarTotal(double precio, double aumento, int cantidadDias) {
        return (precio + aumento) * cantidadDias;
    }
}