package test;
import modelo.Punto;

public class TestPunto {

    public static void main(String[] args) {
        Punto punto1 = new Punto(1.0, 2.0);
        Punto punto2 = new Punto(3.0, 4.0);

        System.out.println("Punto 1: " + punto1);
        System.out.println("Punto 2: " + punto2);

        System.out.println("¿Punto 1 es igual a Punto 2?: " + punto1.equals(punto2));

        System.out.println("Distancia entre Punto 1 y Punto 2: " + punto1.calcularDistancia(punto2));

        Punto punto3 = new Punto(5.0, 6.0);
        Punto punto4 = new Punto(5.0, 6.0);

        System.out.println("Punto 3: " + punto3);
        System.out.println("Punto 4: " + punto4);

        System.out.println("¿Punto 3 es igual a Punto 4?: " + punto3.equals(punto4));

        System.out.println("Distancia entre Punto 3 y Punto 4: " + punto3.calcularDistancia(punto4));
    }
}