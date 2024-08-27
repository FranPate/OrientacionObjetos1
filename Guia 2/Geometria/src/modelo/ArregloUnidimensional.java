package modelo;

public class ArregloUnidimensional {
	// atributos
    private int[] vector;

    // constructor
    public ArregloUnidimensional(int[] vector) {
        this.vector = vector;
    }
    
    // metodos getter y setter
    public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}


    public int traerElMenor() {
        int menor = vector[0];
        for (int num : vector) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    public int traerElMayor() {
        int mayor = vector[0];
        for (int num : vector) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }

    public double calcularPromedio() {
        int suma = 0;
        for (int num : vector) {
            suma += num;
        }
        return (double) suma / vector.length;
    }

    public int[] ordenarAscendente() {
        int[] resultado = vector.clone();
        for (int i = 0; i < resultado.length - 1; i++) {
            for (int j = 0; j < resultado.length - 1 - i; j++) {
                if (resultado[j] > resultado[j + 1]) {
                    int temp = resultado[j];
                    resultado[j] = resultado[j + 1];
                    resultado[j + 1] = temp;
                }
            }
        }
        return resultado;
    }

    public int[] ordenarDescendente() {
        int[] resultado = vector.clone();
        for (int i = 0; i < resultado.length - 1; i++) {
            for (int j = 0; j < resultado.length - 1 - i; j++) {
                if (resultado[j] < resultado[j + 1]) {
                    int temp = resultado[j];
                    resultado[j] = resultado[j + 1];
                    resultado[j + 1] = temp;
                }
            }
        }
        return resultado;
    }

    public int traerFrecuencia(int numero) {
        int cuenta = 0;
        for (int num : vector) {
            if (num == numero) {
                cuenta++;
            }
        }
        return cuenta / vector.length;
    }

	public int traerModa() {
        int moda = vector[0];
        int maxCuenta = 0;

        for (int i = 0; i < vector.length; i++) {
            int cuenta = 0;
            for (int j = 0; j < vector.length; j++) {
                if (vector[j] == vector[i]) {
                    cuenta++;
                }
            }
            if (cuenta > maxCuenta) {
                maxCuenta = cuenta;
                moda = vector[i];
            }
        }
        return moda;
    }
}