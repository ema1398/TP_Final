import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Conserje extends Empleado implements IConserje{
    Map<Integer,Habitaciones> misHabitaciones;

    public Conserje(String nombre,String dni){
        super(nombre, dni);
        this.misHabitaciones=new HashMap<>();
    }
//Creando commit
    @Override
    public void checkIn(Pasajero p) {

    }

    @Override
    public void checkOut(Pasajero p) {

    }

    @Override
    public String reserva(Pasajero p) {
        return "";
    }
}
