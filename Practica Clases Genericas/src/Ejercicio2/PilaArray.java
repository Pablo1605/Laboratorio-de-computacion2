package Ejercicio2;
import java.util.NoSuchElementException;

public class PilaArray<E> {
    private E[] array;
    private int contador;
    private int tamanoMaximo;

    public PilaArray(int tamanoMaximo) {
        this.tamanoMaximo = tamanoMaximo;
        array = (E[]) new Object[tamanoMaximo];
        contador = 0;
    }

    public boolean estaVacia() {
        return contador == 0;
    }

    public boolean añadir(E elemento) {
        if (contador < tamanoMaximo) {
            array[contador] = elemento;
            contador++;
            return true;
        } else {
            return false;
        }
    }

    public E primero() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía.");
        } else {
            return array[contador - 1];
        }
    }

    public E extraer() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía.");
        } else {
            contador--;
            return array[contador];
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PilaArray [");
        for (int i = contador - 1; i >= 0; i--) {
            sb.append(array[i]);
            if (i > 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        PilaArray<Integer> pila = new PilaArray<>(5);
        pila.añadir(1);
        pila.añadir(2);
        pila.añadir(3);

        System.out.println("Elemento en la cima de la pila: " + pila.primero());
        System.out.println("Pila completa: " + pila);

        System.out.println("Elemento extraído: " + pila.extraer());
        System.out.println("Pila después de extraer: " + pila);
    }
}
