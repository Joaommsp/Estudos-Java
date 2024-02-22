package quadrilateros;

public class Quadrado extends Retangulo {

	public Quadrado() {
		super();
	}

	public Quadrado(double lado1, double lado2, String color) {
		super(lado1, lado2, color);
	}
	
	@Override
	public double area() {
		return this.getLado1() * this.getLado2();
 	}
		
	@Override
	public String toString() {
		return "Quadrado lado1 = " + this.getLado1() + " lado2 = " + this.getLado2() + " Area = " + this.area() + " cor:" + this.getColor();
	}
}
