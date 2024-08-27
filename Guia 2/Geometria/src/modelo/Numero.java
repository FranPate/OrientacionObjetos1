package modelo;

public class Numero {
	// atributos
	private int n;

	// constructor
	public Numero(int n) {
		this.n = n;
	}

	// metodos getter y setter
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public int sumar(int n1) {
		return (this.n + n1);
	}
	
	public int multiplicar(int n1) {
		return (this.n * n1);
	}
	
	public boolean esPar() {
		return this.n % 2 == 0;
	}
	
	public boolean esPrimo() {
		if (this.n <= 1) return false;
        if (this.n <= 3) return true;
        if (this.n % 2 == 0 || this.n % 3 == 0) return false;
        for (int i = 5; i * i <= this.n; i += 6) {
            if (this.n % i == 0 || this.n % (i + 2) == 0) return false;
        }
        return true;
	}
	
	public String convertirAString() {
		return String.valueOf(this.n);
	}
	
	public double convertirDouble() {
        return Double.parseDouble(String.valueOf(this.n));
    }
	
	public double calcularPotencia(int exp) {
        return Math.pow(this.n, exp);
    }

    public int calcularFactorial() {
        if (this.n < 0) return 1;
        int resultado = 1;
        for (int i = 1; i <= this.n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método para calcular el número combinatorio C(n, n1)
    public int numeroCombinatorio(int n1) {
        if (n1 < 0 || this.n < 0 || n1 > this.n) return 0;
        return calcularFactorial() / (new Numero(n1).calcularFactorial() * new Numero(this.n - n1).calcularFactorial());
    }
}
