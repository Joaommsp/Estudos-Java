package iphone.usuario;

public class DadosUsuario {

	private Usuario nome;
	private Numero numero;
	
	public DadosUsuario(Usuario nome, Numero numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public Usuario getNome() {
		return nome;
	}

	public Numero getNumero() {
		return numero;
	}
	
}
