package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 12.45, 0.09);
		Produto p2 = new Produto("Caderno", 42.45, 0.09);
		Produto p3 = new Produto("Calculadora", 22.45, 0.09);
		Produto p4 = new Produto("Mochila", 62.45, 0.09);
		Produto p5 = new Produto("Borracha", 2.45, 0.09);
		
		imprimir.accept(p1);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
	
		produtos.forEach(imprimir);
		System.out.println();
		produtos.forEach(p -> System.out.println(p.nome));
		System.out.println();
		produtos.forEach(System.out::println);
		
	}
	
}
