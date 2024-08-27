package modelo;

public class ArregloBidimensional {
	// atributos
    private double[][] matriz;

    // constructor
    public ArregloBidimensional(double[][] matriz) {
        this.matriz = matriz;
    }
    
    // metodos getter y setter
    public double[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(double[][] matriz) {
		this.matriz = matriz;
	}

	public double[][] sumar(double[][] matrizB) {
        if (matriz.length != matrizB.length || matriz[0].length != matrizB[0].length) {
            return null; // Las matrices no tienen las mismas dimensiones
        }
        
        double[][] resultado = new double[matriz.length][matriz[0].length];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado[i][j] = matriz[i][j] + matrizB[i][j];
            }
        }
        
        return resultado;
    }

    public double[][] restar(double[][] matrizB) {
        if (matriz.length != matrizB.length || matriz[0].length != matrizB[0].length) {
            return null; // Las matrices no tienen las mismas dimensiones
        }
        
        double[][] resultado = new double[matriz.length][matriz[0].length];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado[i][j] = matriz[i][j] - matrizB[i][j];
            }
        }
        
        return resultado;
    }

    public double[][] transpuesta() {
        double[][] resultado = new double[matriz[0].length][matriz.length];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado[j][i] = matriz[i][j];
            }
        }
        
        return resultado;
    }

    public double[][] multiplicar(double numero) {
        double[][] resultado = new double[matriz.length][matriz[0].length];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado[i][j] = matriz[i][j] * numero;
            }
        }
        
        return resultado;
    }

    public double[][] multiplicar(double[][] matrizB) {
        if (matriz[0].length != matrizB.length) {
            return null; // El número de columnas de la primera matriz debe ser igual al número de filas de la segunda
        }
        
        double[][] resultado = new double[matriz.length][matrizB[0].length];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                for (int k = 0; k < matriz[0].length; k++) {
                    resultado[i][j] += matriz[i][k] * matrizB[k][j];
                }
            }
        }
        
        return resultado;
    }
}
