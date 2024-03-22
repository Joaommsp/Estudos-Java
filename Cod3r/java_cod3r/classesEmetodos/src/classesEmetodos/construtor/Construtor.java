package classesEmetodos.construtor;

public class Construtor {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 589.00);
		p1.preco = 4357.79;
		
		System.out.printf("Novo valor com desconto R$%.2f\n", p1.precoComDesconto());
		p1.alterarDesconto(0.50);
		
		System.out.printf("Novo valor com desconto R$%.2f\n", p1.precoComDesconto());
		
		
	}
	
}
