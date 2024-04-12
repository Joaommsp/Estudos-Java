package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> printLn = System.out::println;
		
		List<String> marcas = Arrays.asList("BMW ", "AUDI ", "Mercedez ", "Honda\n\n");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(printLn);
		
		//UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		//UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		//UnaryOperator<String> grito = n -> n.concat("!!!");
		
		Utilitarios.maiuscula.andThen(Utilitarios.primeiraLetra).andThen(Utilitarios::gritar).apply("olá");
		
		System.out.println("Usando composição");
		marcas.stream()
			.map(Utilitarios.maiuscula)
			.map(Utilitarios.primeiraLetra)
			.map(Utilitarios::gritar)
			.forEach(printLn);
		
	}
	
}
