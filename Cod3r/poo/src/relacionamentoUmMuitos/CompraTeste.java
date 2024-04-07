package relacionamentoUmMuitos;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem(new Item("Lapis", 15, 5.00));
		compra1.listaDeItens.add(new Item("Caderno", 4, 18.79));
		
		System.out.println(compra1.listaDeItens.size());
		
		System.out.println(compra1.obterValorTotoal());
		 
		// só para mostrar a relação bidirecional
		double total = compra1.listaDeItens.get(0).compra.listaDeItens.get(1).compra.obterValorTotoal();
		
		System.out.println("O total é " + total);
	}
}
