package modelo;

public class Punto {
	// atributos
	private double x;
	private double y;
	
	// constructor
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// metodos getter y setter
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double calcularDistancia(Punto p) {
        double dx = this.x - p.getX();
        double dy = this.y - p.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
	
	//re-definición de métodos de la clase Object
	// sobrecarga
	public boolean equals(Punto p){
		return ((x==p.getX())&&(y==p.getY()));
	}
	
	// re-definición
	@Override
	public String toString(){
		return "("+x+","+y+")";
	}
}