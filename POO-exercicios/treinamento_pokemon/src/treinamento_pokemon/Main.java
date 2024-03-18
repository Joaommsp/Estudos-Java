package treinamento_pokemon;

public class Main {
	public static void main(String[] args) {
		
		Pokemon pikachu = new Pokemon("Pikachu", Tipo.ELETRICO, 5, 25, 4);
		Treinador ash = new Treinador("Ash", pikachu);
		
		System.out.println(pikachu.eixbirInfo());
		
		System.out.println("-------------");
		
		System.out.println(ash.exibirPokemon()); 
		
		System.out.println("-------------");
		
		ash.treinarPokemon(2);
		
		ash.capturarPokemon(new Pokemon("Sharizard", Tipo.FOGO, 10, 50, 25));
		
		System.out.println("-------------");
		
		System.out.println(ash.exibirPokemon()); 
		
		System.out.println("-------------");
		
		ash.treinarPokemon(2);
		
	}
}
