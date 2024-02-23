package formas;

import figura.Figura;

public class Circulo extends Figura{

	private double raio;
	
	public Circulo() {
		
	}
	
	public Circulo(double raio, String color) {
		super(color);
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getDiametro() {
		return raio * 3.14 * 2;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	@Override
	public String toString() {
		return "Circulo: raio = " + raio + " Diamatro = " + getDiametro() + " Cor:" + getColor();
	}
	
}
