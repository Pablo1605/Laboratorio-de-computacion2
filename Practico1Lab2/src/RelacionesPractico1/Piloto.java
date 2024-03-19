package RelacionesPractico1;

public class Piloto extends Persona implements Volador {
    private int rango;

    public void volar(){
    }

    public Piloto(int rango) {
        this.rango = rango;
    }

    public Piloto(int edad, String nombre, int rango) {
        super(edad, nombre);
        this.rango = rango;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }
}
