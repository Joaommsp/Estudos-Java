package bob_esponja;

public class Personagens {
	private String nome;
	private Personagens melhorAmigo;
	
	public Personagens(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void falar() {
		System.out.println("Olá meu nome é " + this.getNome());
	}

	public  void getMelhorAmigo() {
		System.out.println(melhorAmigo.getNome()); 
	}

	public void fazerAmizade(Personagens melhorAmigo) {
		this.melhorAmigo = melhorAmigo;
		System.out.println(this.nome + " fez amizade com " + this.melhorAmigo.getNome());
	}
		
}
