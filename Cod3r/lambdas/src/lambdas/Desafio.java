package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3450.00, 0.04);
		
		BiFunction<Produto, Double, Double> impostoMunicipal = 
				(produto, precoproduto) -> precoproduto * ( 1 - 0.85);
		
		Function<Double, Double> frete = preco -> preco >= 3000.0 ? 100.0 : 50.0;
		
		DecimalFormat formatador = new DecimalFormat();
		
		Function<Double, String> formatarPreco = 
				preco -> formatador.format(preco);
		
				System.out.println(impostoMunicipal.andThen(frete).andThen(formatarPreco).apply(p, p.preco));
				
	}
	
}
