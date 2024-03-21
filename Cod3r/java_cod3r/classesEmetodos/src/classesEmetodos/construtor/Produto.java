package classesEmetodos.construtor;

public class Produto {

	String nome;
	double preco;
	double desconto;

	public Produto() {
		
	}
	
	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	double precoComDesconto() {
		return preco * (1-desconto);
	}
	
	double precoComdesconto(double descontoDoGerente) {
		return preco * (1- desconto + descontoDoGerente);
	}
	
	
}
