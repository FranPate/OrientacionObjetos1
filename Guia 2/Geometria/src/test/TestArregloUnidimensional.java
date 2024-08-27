package test;
import modelo.ArregloUnidimensional;

public class TestArregloUnidimensional {
    public static void main(String[] args) {
        int[] numeros = {4, 2, 7, 34, 6734, 8, 7345, 247, 2};

        ArregloUnidimensional arreglo = new ArregloUnidimensional(numeros);
        System.out.println("El menor valor es: " + arreglo.traerElMenor());
        System.out.println("El mayor valor es: " + arreglo.traerElMayor());
        System.out.println("El promedio es: " + arreglo.calcularPromedio());
        
        System.out.print("Orden ascendente: ");
        for (int num : arreglo.ordenarAscendente()) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Orden descendente: ");
        for (int num : arreglo.ordenarDescendente()) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        System.out.println("Frecuencia del número 2: " + arreglo.traerFrecuencia(2));
        System.out.println("La moda es: " + arreglo.traerModa());
    }
}