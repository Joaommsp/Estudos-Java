package treinamento_pokemon;

public class Pokemon {
	
	private String nome;
	private Tipo tipo;
	private int nivel;
	private int poderDeAtaque;
	private int poderDeDefesa;
	
	public Pokemon(String nome, Tipo tipo, int nivel, int poderDeAtaque, int poderDeDefesa) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.nivel = nivel;
		this.poderDeAtaque = poderDeAtaque;
		this.poderDeDefesa = poderDeDefesa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getPoderDeAtaque() {
		return poderDeAtaque;
	}

	public void setPoderDeAtaque(int poderDeAtaque) {
		this.poderDeAtaque = poderDeAtaque;
	}

	public int getPoderDeDefesa() {
		return poderDeDefesa;
	}

	public void setPoderDeDefesa(int poderDeDefesa) {
		this.poderDeDefesa = poderDeDefesa;
	}

	public String eixbirInfo() {
		return "Pokemon [nome=" + nome + ", tipo=" + tipo + ", nivel=" + nivel + ", poderDeAtaque=" + poderDeAtaque
				+ ", poderDeDefesa=" + poderDeDefesa + "]";
	}
	
}
