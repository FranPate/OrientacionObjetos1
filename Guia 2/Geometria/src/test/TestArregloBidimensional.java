package test;
import modelo.ArregloBidimensional;
import java.util.Arrays;

public class TestArregloBidimensional {
    public static void main(String[] args) {
        double[][] matrizA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        double[][] matrizB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        ArregloBidimensional arregloA = new ArregloBidimensional(matrizA);
        
        System.out.println("Suma de matrices:");
        imprimirMatriz(arregloA.sumar(matrizB));

        System.out.println("\nResta de matrices:");
        imprimirMatriz(arregloA.restar(matrizB));

        System.out.println("\nTranspuesta de la matriz A:");
        imprimirMatriz(arregloA.transpuesta());

        System.out.println("\nMultiplicación de la matriz A por 2:");
        imprimirMatriz(arregloA.multiplicar(2));

        System.out.println("\nMultiplicación de matrices A y B:");
        imprimirMatriz(arregloA.multiplicar(matrizB));
    }

    private static void imprimirMatriz(double[][] matriz) {
        if (matriz == null) {
            System.out.println("Operación no válida.");
        } else {
            for (double[] fila : matriz) {
                System.out.println(Arrays.toString(fila));
            }
        }
    }
}