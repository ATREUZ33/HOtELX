package interfaces;

import entity.Reservacion;
import java.util.ArrayList;

public interface IReservacionService {
    public void agregar(Reservacion reservacion);
    public ArrayList<Reservacion> listar();
}