package iphone.aplicativos;

public interface AppMensagem {
	void enviarMensagem(String mensagem, String destinatario);
    void receberMensagem(String mensagem, String remetente);
}
