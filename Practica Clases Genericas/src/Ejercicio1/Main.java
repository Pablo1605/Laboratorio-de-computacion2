package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Calculadora<Integer> calcEnteros = new Calculadora<>();
        System.out.println("Suma: " + calcEnteros.sumar(5, 3));
        System.out.println("Resta: " + calcEnteros.restar(5, 3));
        System.out.println("Multiplicación: " + calcEnteros.multiplicar(5, 3));
        System.out.println("División: " + calcEnteros.dividir(5, 3));

        Calculadora<Double> calcDoubles = new Calculadora<>();
        System.out.println("Suma: " + calcDoubles.sumar(5.5, 3.2));
        System.out.println("Resta: " + calcDoubles.restar(5.5, 3.2));
        System.out.println("Multiplicación: " + calcDoubles.multiplicar(5.5, 3.2));
        System.out.println("División: " + calcDoubles.dividir(5.5, 3.2));
    }
}
