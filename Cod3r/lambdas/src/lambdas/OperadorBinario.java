package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = 
				(num1, num2) -> (num1 + num2)/2;
				
				System.out.println(media.apply(2.4, 9.5));
				
				
				BiFunction<Double, Double, String> resultado = 
						(n1, n2) -> ((n1 + n2)/ 2) >= 7 ? "Aprovado" : "Reprovado";
						
						BiFunction<Double, Double, String> resultado2 = (n1, n2) -> {
							double notaMedia = (n1 + n2) / 2;
							return notaMedia >= 7 ? "Aprovado" : "Reprovado";	
						};
						
						System.out.println(resultado2.apply(9.0, 5.6));
						
						Function<Double, String> conceito =
								m -> m >= 7 ? "Aprovado" : "Reprovado";
								
								System.out.println(media.andThen(conceito).apply(9.0, 5.6));
						
			}
}
