public class Habitaciones {
    boolean ocupada;
    boolean activa;
    int nroHabitacion;

    public Habitaciones(boolean ocupada,int nroHabitacion,boolean activa){
        this.ocupada=ocupada;
        this.activa=activa;
        this.nroHabitacion=nroHabitacion;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}
