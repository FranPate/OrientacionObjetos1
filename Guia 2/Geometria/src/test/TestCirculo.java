package test;
import modelo.Punto;
import modelo.Circulo;

public class TestCirculo {

    public static void main(String[] args) {
        // Crear dos objetos Circulo
        Punto origen1 = new Punto(1.0, 2.0);
        Circulo circulo1 = new Circulo(origen1, 5.0);

        Punto origen2 = new Punto(3.0, 4.0);
        Circulo circulo2 = new Circulo(origen2, 5.0);

        // Imprimir los círculos
        System.out.println("Círculo 1: " + circulo1);
        System.out.println("Círculo 2: " + circulo2);

        // Imprimir el resultado de equals entre los círculos
        System.out.println("¿Círculo 1 es igual a Círculo 2?: " + circulo1.equals(circulo2));

        // Imprimir la distancia entre los círculos
        System.out.println("Distancia entre Círculo 1 y Círculo 2: " + circulo1.calcularDistancia(circulo2));

        // Imprimir el perímetro y el área del Círculo 1
        System.out.println("Perímetro del Círculo 1: " + circulo1.calcularPerimetro());
        System.out.println("Área del Círculo 1: " + circulo1.calcularArea());
    }
}