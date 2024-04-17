package streams;

public class Aluno {

	final String nome;
	final double nota;
	final boolean bomCoportamento;
	
	public Aluno(String nome, double nota) {
		// TODO Auto-generated constructor stub
		this(nome, nota, true);
	}
	
	public Aluno(String nome, double nota, boolean bomComportamento) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.bomCoportamento = true;
	}
	
	@Override
	public String toString() {
		return "Aluno: " + nome + ", nota=" + nota;
	}
	
	
}
