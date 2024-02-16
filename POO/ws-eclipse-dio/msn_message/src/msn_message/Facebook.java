package msn_message;

public class Facebook extends ServicoMensagem{

	public Facebook(String nomeAplicativo) {
		super(nomeAplicativo);
		
	}

	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo facebook");
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo facebook");
	}
	
}
