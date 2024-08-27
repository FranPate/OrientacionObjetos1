package test;
import modelo.Numero;

public class TestNumero {
    public static void main(String[] args) {
        Numero numero = new Numero(5);

        System.out.println("Sumar 10: " + numero.sumar(10));
        System.out.println("Multiplicar por 3: " + numero.multiplicar(3));
        System.out.println("Es par: " + numero.esPar());
        System.out.println("Es primo: " + numero.esPrimo());
        System.out.println("Convertir a String: " + numero.convertirAString());
        System.out.println("Convertir a double: " + numero.convertirDouble());
        System.out.println("Calcular potencia 3: " + numero.calcularPotencia(3));
        System.out.println("Calcular factorial: " + numero.calcularFactorial());
        System.out.println("Número combinatorio C(5, 3): " + numero.numeroCombinatorio(3));
    }
}