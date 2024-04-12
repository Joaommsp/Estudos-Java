package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import java.util.function.Function;
import java.text.DecimalFormat;

import java.util.Locale; // Que permitirá a configuração da localidade.
import java.text.NumberFormat;// Permitirá a formatação do número adequadamente.


public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3450.00, 0.04);
				
		Function<Produto, Double> calcularDesconto =
				p -> p.getPreco() * ( 1 - p.getDesconto());
				
				Function<Double, Double> impostoMunicipal =
						precoProduto -> precoProduto + (precoProduto * 0.085);
						
						Function<Double, Double> calcularFrete = 
								precoProduto -> {
									if(precoProduto >= 3000.00) {
										return precoProduto + 100.00;
									}
									else {
										return precoProduto + 50.00;
									}
								};
				
	DecimalFormat df = new DecimalFormat("#.##");

								
			Function<Double, String> arredondar =
					valor -> {
						String resultado = String.format("%.2f", valor);
						
						return resultado.replace(",", ".");
					};
			
					 
					 Function<String, String> formatar =
							 valor -> {
								
									double value = Double.parseDouble(valor);
									
									return NumberFormat.getCurrencyInstance(Locale.US).format(value);
								 
							 };
							 
		Produto p1 = new Produto("notebook", 2500.00, 0.05);
					
		System.out.println(calcularDesconto.apply(p1));
		System.out.println(calcularFrete.apply(p1.preco));
		System.out.println(arredondar.apply(p1.preco));
		System.out.println(formatar.apply(Double.toString(p1.preco)));
		
		System.out.println(calcularDesconto
				.andThen(impostoMunicipal)
				.andThen(calcularFrete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p1));
	}
	
}
