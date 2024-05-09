package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen<>();

        almacen.añadirElemento(new Producto("Leche", 1.5));
        almacen.añadirElemento(new Producto("Pan", 0.75));
        almacen.añadirElemento(new Producto("Televisor", 499.99));

        almacen.imprimirElementos();
    }
}
