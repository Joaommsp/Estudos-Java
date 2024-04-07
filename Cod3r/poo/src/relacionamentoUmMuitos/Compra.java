package relacionamentoUmMuitos;

import java.util.ArrayList;

public class Compra { 

		String cliente;
		ArrayList<Item> listaDeItens = new ArrayList<Item>();		
		
		void adicionarItem(Item item) {
			this.listaDeItens.add(item);
			item.compra = this;
		}
		
		
		void adicionarItem(String nome, int quantidade, double preco) {
			this.adicionarItem(new Item(nome, quantidade, preco));
		}
		
		double obterValorTotoal() {
			double total = 0;
			
			for (Item item : listaDeItens) {
				total += item.quantidade * item.preco;
			}
			
			return total; 
		}
	
}
