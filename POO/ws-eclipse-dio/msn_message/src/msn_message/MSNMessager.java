package msn_message;

public class MSNMessager extends ServicoMensagem {

	public MSNMessager(String nomeAplicativo) {
		super(nomeAplicativo);
	}

	public void enviarMensagem() {	
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN");
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN");
	}
	
}
