package lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(2, 1));
		
		calculo = new Multiplicar();
		System.out.println(calculo.executar(2, 1));
		
		System.out.println(calculo.legal());
		System.out.println(Calculo.muitoLegal());
	}
	
}
