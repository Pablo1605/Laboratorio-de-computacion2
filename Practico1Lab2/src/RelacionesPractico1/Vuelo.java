package RelacionesPractico1;

public class Vuelo {
    private String destino;
    private int numVVuelo;

    private Persona persona;

    public Vuelo() {
    }

    public Vuelo(String destino, int numVVuelo) {
        this.destino = destino;
        this.numVVuelo = numVVuelo;
    }


    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getNumVVuelo() {
        return numVVuelo;
    }

    public void setNumVVuelo(int numVVuelo) {
        this.numVVuelo = numVVuelo;
    }

    public void agregarPersona(Persona persona1){
        this.persona = persona1;
    }
}
