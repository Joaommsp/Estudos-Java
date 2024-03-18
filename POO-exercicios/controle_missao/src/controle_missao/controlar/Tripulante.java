package controle_missao.controlar;

public class Tripulante {
	private String nome;
	private int idade;
	private String funcao;
	
	public Tripulante(String nome, int idade, String funcao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.funcao = funcao;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
}
