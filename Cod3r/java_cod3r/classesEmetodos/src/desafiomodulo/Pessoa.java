package desafiomodulo;

public class Pessoa {

	private String nome;
	private double pesoInicial;
	private double peso;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.pesoInicial = peso;
	}
	
	public String getNome() {
		return nome;
	}

	public double getPesoInicial() {
		return pesoInicial;
	}

	public double getPeso() {
		return peso;
	}

	public void comer(Comida comida) {
		
		if(comida != null) {
			this.peso += comida.getPeso();
		}	
	}
	
}
