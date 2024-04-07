package desafioComposicao;

import java.util.ArrayList;

public class Compra {

	private ArrayList<Item> compras = new ArrayList<Item>();
	private double preco = 0.0;

	public Compra() {
		
	}
	
	public Compra(String nome, double preco, int quantidade) {
		this.compras.add(new Item(nome, preco, quantidade));
	}
	
	public ArrayList<Item> getCompras() {
		return compras;
	}
	
	public void adicionarItem(Item item) {
		this.compras.add(item);
	}
	
	public double calcularValorCompra() {
		for (Item item : compras) {
			preco += item.getProduto().getPreco() * item.getQuantidade();
		}
		return preco;
	}

	@Override
	public String toString() {
		return "Compra [compras=" + compras + ", preco=" + preco + "]";
	}

	
}
