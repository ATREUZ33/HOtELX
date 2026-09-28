package service;

import entity.MetodosReservacion;
import entity.Reservacion;
import interfaces.IReservacionDAO;
import interfaces.IReservacionService;
import java.util.ArrayList;

public class ReservacionService implements IReservacionService {

    IReservacionDAO reservaciondao;

    public ReservacionService(IReservacionDAO reservaciondao) {
        this.reservaciondao = reservaciondao;
    }

    @Override
    public void agregar(Reservacion reservacion) {
        MetodosReservacion metodos = new MetodosReservacion();
        double precio  = metodos.hallarPrecio(reservacion.getTipoCuarto());
        double aumento = metodos.hallarAumento(precio, reservacion.getFechaReserva());
        double total   = metodos.hallarTotal(precio, aumento, reservacion.getCantidadDias());

        reservacion.setPrecio(precio);
        reservacion.setAumento(aumento);
        reservacion.setTotal(total);

        reservaciondao.agregar(reservacion);
    }

    @Override
    public ArrayList<Reservacion> listar() {
        if (reservaciondao.listar().size() > 0) {
            return reservaciondao.listar();
        }
        return null;
    }
}