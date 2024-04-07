package desafioComposicao;

import java.util.ArrayList;

public class Cliente {

		private String nome;
		private ArrayList<Compra> compras = new ArrayList<Compra>();
		
		public Cliente(String nome) {
			super();
			this.nome = nome;
		}

		public String getNome() {
			return nome;
		}

		public ArrayList<Compra> getCompras() {
			return compras;
		}

		public void adicionarCompra(Compra compra) {
			this.compras.add(compra);
		}

		public Double calcularValorTotal() {
			
			double valorTotal = 0.0;
			
			for (Compra compra : this.getCompras()) {
				valorTotal += compra.calcularValorCompra();
			}
			
			return valorTotal;
		}
		
		public Double calcularValorCompra(Compra compra) {
			return compra.calcularValorCompra();
		}
		
		@Override
		public String toString() {
			return "Cliente [nome=" + nome + ", compras=" + compras + "]";
		}
		
		
}
