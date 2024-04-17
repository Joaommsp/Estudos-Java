package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {

	public static void main(String[] args) {
		
		Produtos2 p1 = new Produtos2("Lapis", 1.99, 0.12, 30.00);
		Produtos2 p2 = new Produtos2("Notebook", 2500.00, 0.20, 0.00);
		Produtos2 p3 = new Produtos2("Computador de Mesa", 1899.99, 0.50, 400.00);
		Produtos2 p4 = new Produtos2("Pneu", 459.99, 0.25, 0.00);
		Produtos2 p5 = new Produtos2("Mouse Gamer", 356.99, 0.10, 50.00);
		Produtos2 p6 = new Produtos2("Teclado Gamer", 250.00, 0.10, 50.00);
		Produtos2 p7 = new Produtos2("Cadeira Gamer", 1250.00, 0.05, 30);
		Produtos2 p8 = new Produtos2("Ventilador", 249.00, 0.12, 30);
		Produtos2 p9 = new Produtos2("Caderno", 15.99, 0.10, 30);
		
		
		List<Produtos2> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9);
		
		//filter, filter , map
		Predicate<Produtos2> descontosInteressantes = p -> p.getDesconto() > 0.10;
		Predicate<Produtos2> freteGratis = p -> p.getValorFrete() == 0.0; 
		
		Function<Produtos2, String> superPromo = 
				prod -> "Aproveite " + prod.getNome() + " por R$" + prod.getPreco() + " e frete totalmente gratis!" ;
		
				produtos.stream()
				 .filter(descontosInteressantes)
				 .filter(freteGratis)
				 .map(superPromo)
				 .forEach(System.out::println);
	}
	
}
