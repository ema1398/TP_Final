import java.util.ArrayList;
import java.util.List;

public final class EmpleadoAdministrativo extends Empleado implements IAdministrativo {
    List<Pasajero>misPasajeros;
    public EmpleadoAdministrativo(String nombre,String dni){
        super(nombre,dni);
        this.misPasajeros=new ArrayList<>();
    }


    @Override
    public String backUp() {
        String mensaje="nada";
        if(misPasajeros.isEmpty()){
            mensaje="ListaVacia";
        }
        for(int i=0;i<misPasajeros.size();i++){
            mensaje="Datos Pasajeros: \nNombre: "+misPasajeros.get(i).getNombre()+
                    " \nDni: "+misPasajeros.get(i).getDni()+
                    " \nOrigen: "+misPasajeros.get(i).getOrigen()+
                    "\n Direccion: "+misPasajeros.get(i).getDomicilio();
        }
        return mensaje;
    }

    @Override
    public void crarUsuario() {

    }

    @Override
    public void permisosUsuario() {

    }
}
