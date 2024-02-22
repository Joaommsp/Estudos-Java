package formas;

import figura.Figura;

public class Triangulo extends Figura {

	private double base;
	private double altura;
	
	public Triangulo() {
		
	}
	
	public Triangulo(double base, double altura, String color) {
		super(color);
		this.base = base;
		this.altura = altura;
		this.setColor(color);
	}
	
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return (this.base * this.altura) / 2;
	}
	
	@Override
	public String toString() {
		return "Triangulo: base = " + base + " altura = " + altura + " Cor:" + getColor(); 
	}
	
}
