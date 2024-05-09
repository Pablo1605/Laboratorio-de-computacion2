package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();

        almacen.añadirProducto(new Producto("Leche", 1.5));
        almacen.añadirProducto(new Producto("Pan", 0.75));
        almacen.añadirProducto(new Producto("Televisor", 499.99));

        almacen.imprimirProductos();
    }
}
