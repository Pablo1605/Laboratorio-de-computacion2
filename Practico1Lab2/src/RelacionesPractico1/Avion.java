package RelacionesPractico1;

public class Avion implements Volador{
    private int cantAsientos;
    private double combustible;

    private Flota flota;

    public Avion() {
    }

    public Avion(int cantAsientos, double combustible, String ubicacion) {
        this.cantAsientos = cantAsientos;
        this.combustible = combustible;
        this.flota = new Flota(ubicacion);
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    @Override
    public void volar() {

    }
}
