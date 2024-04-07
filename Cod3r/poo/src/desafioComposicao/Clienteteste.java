package desafioComposicao;

public class Clienteteste {
	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Macarrão", 8.99);
		Item item1 = new Item();
		item1.setProduto(produto1);
		
		Item item2 = new Item("Arroz", 15.99, 3);
		
		Compra compra1 = new Compra();
		compra1.adicionarItem(item2);
		compra1.adicionarItem(item1);
		
		Compra compra2 = new Compra("Queijo", 5.99, 5);
				
		Cliente cliente1 = new Cliente("João");
		
		cliente1.adicionarCompra(compra2);
		cliente1.adicionarCompra(compra1);
		
		System.out.println(cliente1.getCompras());
		
		//System.out.println(cliente1.calcularValorTotal());
		// System.out.println(cliente1.calcularValorCompra(compra2));
		System.out.println(cliente1.calcularValorCompra(compra1));
		
	}
}
