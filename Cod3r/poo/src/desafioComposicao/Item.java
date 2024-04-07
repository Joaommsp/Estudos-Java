package desafioComposicao;

public class Item {

	private Produto produto;
	private int quantidade = 1;

	public Item() {
	}
	
	public Item(String nome, double preco, int quantidade) {
		this.produto = new Produto(nome, preco);
		this.quantidade = quantidade;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Item [produto=" + produto + "]";
	}
	
	
	
}
