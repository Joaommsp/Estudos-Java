package streams;

public class Produtos2 {
	
	private String nome;
	private double preco;
	private double desconto;
	private double valorFrete;
	
	public Produtos2(String nome, double preco, double desconto, double valorFrete) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.valorFrete = valorFrete;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public double getValorFrete() {
		return valorFrete;
	}
	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}

	@Override
	public String toString() {
		return "Produtos2 [nome=" + nome + "]";
	}

}
