package Ejercicio3;
import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Producto> productos;

    public Almacen() {
        productos = new ArrayList<>();
    }

    public void añadirProducto(Producto producto) {
        productos.add(producto);
    }

    public void imprimirProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
