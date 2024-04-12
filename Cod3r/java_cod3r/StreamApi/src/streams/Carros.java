package streams;

public class Carros {

	private String nome;
	private int qtdCilintros;
	
	public Carros(String nome, int qtdCilindros) {
		this.nome = nome;
		this.qtdCilintros = qtdCilindros;	
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQtdCilintros() {
		return qtdCilintros;
	}
	
	public void setQtdCilintros(int qtdCilintros) {
		this.qtdCilintros = qtdCilintros;
	}

	@Override
	public String toString() {
		return "Carros [nome=" + nome + ", qtdCilintros=" + qtdCilintros + "]";
	}
	
}
