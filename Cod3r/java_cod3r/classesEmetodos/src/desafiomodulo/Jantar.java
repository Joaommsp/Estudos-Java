package desafiomodulo;

public class Jantar {
	public static void main(String[] args) {
		
		Comida pizza = new Comida("Pizza", 1);
		Pessoa joao = new Pessoa("João", 86);
		
		System.out.println("Peso joao: " + joao.getPeso());
		
		joao.comer(pizza);
		
		System.out.println("Peso joao: " + joao.getPeso());
		
		System.out.println("Peso inicial joao: " + joao.getPesoInicial());
		
	}
}
