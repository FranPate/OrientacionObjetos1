package modelo;

public class Circulo {
	// atributos
    private Punto origen;
    private double radio;

    // constructor
    public Circulo(Punto origen, double radio) {
        this.origen = origen;
        this.radio = radio;
    }

    // metodos getter y setter
    public Punto getOrigen() {
        return origen;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public boolean equals(Circulo c) {
        return this.origen.equals(c.getOrigen()) && this.radio == c.getRadio();
    }

    @Override
    public String toString() {
        return "Círculo [Origen: " + origen + ", Radio: " + radio + "]";
    }

    public double calcularDistancia(Circulo c) {
        return this.origen.calcularDistancia(c.getOrigen());
    }
}