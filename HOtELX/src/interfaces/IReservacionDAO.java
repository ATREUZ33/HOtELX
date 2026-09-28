package interfaces;

import entity.Reservacion;
import java.util.ArrayList;

public interface IReservacionDAO {
    public void agregar(Reservacion reservacion);
    public ArrayList<Reservacion> listar();
}