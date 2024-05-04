package br.com.joao.calc.modelo;

public class Memory {

	private static final Memory instancia = new Memory();
	
	private String textoAtual = "";
	
	private Memory() {
		
	}

	public static Memory getInstancia() {
		return instancia;
	}

	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}
	
	
}
