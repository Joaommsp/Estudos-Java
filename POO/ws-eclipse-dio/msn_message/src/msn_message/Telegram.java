package msn_message;

public class Telegram extends ServicoMensagem {

	public Telegram(String nomeAplicativo) {
		super(nomeAplicativo);
	}

	public void enviarMensagem() {		
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo TELEGRAM");
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo TELEGRAM");
	}
	
}
