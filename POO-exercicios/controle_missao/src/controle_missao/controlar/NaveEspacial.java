package controle_missao.controlar;

public class NaveEspacial {

	private String nome;
	private int qtdTripulantes = 0;
	private Status status;
	
	public NaveEspacial() {
		super();
	}

	public NaveEspacial(String nome, Status status) {
		super();
		this.nome = nome;
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public int getQtdTripulantes() {
		return qtdTripulantes;
	}

	public void setQtdTripulantes(int qtdTripulantes) {
		this.qtdTripulantes = qtdTripulantes;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "NaveEspacial [nome=" + nome + ", qtdTripulantes=" + qtdTripulantes + ", status=" + status + "]";
	}
	
	
	
	
}
