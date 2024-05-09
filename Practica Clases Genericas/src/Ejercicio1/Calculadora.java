package Ejercicio1;

public class Calculadora<E extends Number> implements Operable<E>{
    @Override
    public E sumar(E a, E b) {
        if (a instanceof Integer) {
            return (E) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double) {
            return (E) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else {
            throw new IllegalArgumentException("Tipo de dato no soportado para la suma.");
        }
    }

    @Override
    public E restar(E a, E b) {
        if (a instanceof Integer) {
            return (E) Integer.valueOf(a.intValue() - b.intValue());
        } else if (a instanceof Double) {
            return (E) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else {
            throw new IllegalArgumentException("Tipo de dato no soportado para la resta.");
        }
    }

    @Override
    public E multiplicar(E a, E b) {
        if (a instanceof Integer) {
            return (E) Integer.valueOf(a.intValue() * b.intValue());
        } else if (a instanceof Double) {
            return (E) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else {
            throw new IllegalArgumentException("Tipo de dato no soportado para la multiplicación.");
        }
    }

    @Override
    public E dividir(E a, E b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }

        if (a instanceof Integer) {
            return (E) Integer.valueOf(a.intValue() / b.intValue());
        } else if (a instanceof Double) {
            return (E) Double.valueOf(a.doubleValue() / b.doubleValue());
        } else {
            throw new IllegalArgumentException("Tipo de dato no soportado para la división.");
        }
    }
}
