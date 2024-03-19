package RelacionesPractico1;

public class Main {
    public static void main(String[] args){
        Persona p1 = new Persona(19,"Pablo");
        Reserva r1 = new Reserva(1);
        Avion a1 = new Avion(180,30000,"Argentina");
        Pasajero pa1 = new Pasajero(3);
        Piloto pi1 = new Piloto(3);
        Flota f1 = new Flota("Argentina");
        Vuelo v1 = new Vuelo("Brasil",112);

        v1.agregarPersona(p1);

        p1.mostrarDatos();
    }
}
