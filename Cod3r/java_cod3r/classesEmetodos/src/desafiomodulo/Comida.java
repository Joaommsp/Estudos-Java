package desafiomodulo;

public class Comida {
	
	private String nome;
	private double peso;
	
	public Comida() {
		
	}
	
	public Comida(String nome, double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}
	
	
}
