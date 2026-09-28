public class Pasajero {
    String nombre;
    private String dni;
    String origen;
    String domicilio;

    public Pasajero(String nombre,String dni,String origen,String domicilio){
        this.nombre=nombre;
        this.dni=dni;
        this.origen=origen;
        this.domicilio=domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getOrigen() {
        return origen;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDomicilio() {
        return domicilio;
    }
}
