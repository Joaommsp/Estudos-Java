package msn_message;

public class PcDoPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger

		ServicoMensagem smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="msn"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessager(appEscolhido);
		else if(appEscolhido.equals("fbm"))
			smi = new Facebook(appEscolhido);
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram(appEscolhido);
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
