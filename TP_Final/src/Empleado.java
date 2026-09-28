import java.util.ArrayList;
import java.util.List;

public abstract class Empleado {
    String nombre;
    private String dni;

    public Empleado(String nombre,String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

}
