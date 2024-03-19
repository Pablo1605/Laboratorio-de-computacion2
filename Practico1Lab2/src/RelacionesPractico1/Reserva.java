package RelacionesPractico1;

public class Reserva {
    private int numAsientos;

    private Vuelo vuelo;

    public Reserva(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public void agregarVuelo(Vuelo vuelo1) {
        this.vuelo = vuelo1;
    }
}
