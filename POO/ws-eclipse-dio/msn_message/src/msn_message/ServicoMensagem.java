package msn_message;

public abstract class ServicoMensagem {
	
	private String nomeAplicativo;
	
	public ServicoMensagem(String nomeAplicativo) {
		this.nomeAplicativo = nomeAplicativo;
	}
	
	public abstract void enviarMensagem() ;
	public abstract void receberMensagem() ;
	
	//métodos privadas, visíveis somente na classe
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}
