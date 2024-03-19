package RelacionesPractico1;

public class Pasajero extends Persona{
    private int equipaje;

    private Reserva reserva;

    public Pasajero(int equipaje) {
        this.equipaje = equipaje;
    }

    public Pasajero(int edad, String nombre, int equipaje,int numAsientos) {
        super(edad, nombre);
        this.equipaje = equipaje;
        this.reserva = new Reserva(numAsientos);
    }

    public int getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(int equipaje) {
        this.equipaje = equipaje;
    }
}
