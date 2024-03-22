package classesEmetodos.construtor;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;

	public Produto() {
		
	}
	
	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	double precoComDesconto() {
		return preco * (1-desconto);
	}
	
	double precoComdesconto(double descontoDoGerente) {
		return preco * (1- desconto + descontoDoGerente);
	}
	
	void alterarDesconto(double novoDesconto) {
		desconto = novoDesconto;
	}
	
}
