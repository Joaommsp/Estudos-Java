package msn_message;

public class PcDoPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		MSNMessager msn = new MSNMessager("MSN");
		msn.enviarMensagem();
		msn.receberMensagem();
		
		Facebook face = new Facebook("FACE");
		face.enviarMensagem();
		face.receberMensagem();
		
		Telegram tele = new Telegram("TELEGRAM");
		tele.enviarMensagem();
		tele.receberMensagem();
	}
}
