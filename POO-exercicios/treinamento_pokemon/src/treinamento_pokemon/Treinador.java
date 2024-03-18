package treinamento_pokemon;

public class Treinador {
	
	private String nome;
	private Pokemon pokemonAtual;
	
	public Treinador(String nome, Pokemon pokemonAtual) {
		super();
		this.nome = nome;
		this.pokemonAtual = pokemonAtual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pokemon getPokemonAtual() {
		return pokemonAtual;
	}

	public void setPokemonAtual(Pokemon pokemonAtual) {
		this.pokemonAtual = pokemonAtual;
	}
	
	public void capturarPokemon(Pokemon novoPokemon) {
		setPokemonAtual(novoPokemon);
	}

	public void treinarPokemon(int tempoDeTreino) {
		this.pokemonAtual.setPoderDeAtaque(10 * tempoDeTreino);
		this.pokemonAtual.setPoderDeDefesa(5 * tempoDeTreino);
		
		System.out.println("O pokemon " + this.pokemonAtual.getNome() + "\n"
				+ "Treinou por " + tempoDeTreino + " horas" + "\n"
				+ "Novo poder de ataque: " + this.pokemonAtual.getPoderDeAtaque() + "\n"
				+ "Novo poder de defesa: " + this.pokemonAtual.getPoderDeDefesa() 
				);
	}
	
	public String exibirPokemon() {
		return "PokemonAtual=" + pokemonAtual.getNome() + "\n"
				+ "Nivel= " + pokemonAtual.getNivel() + "\n"
				+ "Ataque= " + pokemonAtual.getPoderDeAtaque() + "\n"
				+ "Defensa= " + pokemonAtual.getPoderDeDefesa() + "\n"
				+ "Tipo= " + pokemonAtual.getTipo() 
				;
	}
	
	
}
