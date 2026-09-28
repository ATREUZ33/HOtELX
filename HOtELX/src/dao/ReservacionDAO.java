package dao;

import entity.Reservacion;
import interfaces.IReservacionDAO;
import java.util.ArrayList;

public class ReservacionDAO implements IReservacionDAO {

    ArrayList<Reservacion> lstReservaciones = new ArrayList();

    @Override
    public void agregar(Reservacion reservacion) {
        lstReservaciones.add(reservacion);
    }

    @Override
    public ArrayList<Reservacion> listar() {
        return lstReservaciones;
    }
}