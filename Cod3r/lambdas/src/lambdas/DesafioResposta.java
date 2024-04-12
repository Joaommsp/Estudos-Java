package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioResposta {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3250.00, 0.13);
		
		Function<Produto, Double> precoFinal =
			prod -> p.getPreco() * (1 - p.desconto);
			
		UnaryOperator<Double> impostoMunicipal =
				preco -> preco >= 2500 ? preco * 1.085 : preco;
				
		UnaryOperator<Double> frete =
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
				
		UnaryOperator<Double> arredondar =
				preco -> {
					String value = String.format("%.2f", preco);
					
					return Double.parseDouble(value.replace(",", "."));
				};
				
		Function<Double, String> formatar =
				preco -> ("R$" + preco).replace(".", ",");
	
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println(preco);
		
	}
	
}
