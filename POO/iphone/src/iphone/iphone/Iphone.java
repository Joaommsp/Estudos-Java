package iphone.iphone;

import iphone.usuario.DadosUsuario;
import iphone.usuario.Numero;
import iphone.usuario.Usuario;

public class Iphone {
	private DadosUsuario dadosUsuario;
	
	 public Iphone(DadosUsuario dadosUsuario) {
	        this.dadosUsuario = dadosUsuario;
	    }
	 
	 public static void main(String[] args) {
		 
		 	Usuario usuario = new Usuario("João");
	        Numero numero = new Numero("123-456-7890");
	        DadosUsuario dadosUsuario = new DadosUsuario(usuario, numero);
	        
	        Iphone app = new Iphone(dadosUsuario);
	        
	        app.enviarMensagem("Olá", "Pedro");
	        app.fazerChamada("40028922");
	        app.tocarMusica("Legends");
	        app.pausarMusica();
	        
	}
	 
	 public void enviarMensagem(String mensagem, String destinatario) {
	        System.out.println("Enviando mensagem: \"" + mensagem + "\" para " + destinatario);
	    }

	    public void receberMensagem(String mensagem, String remetente) {
	        System.out.println("Recebendo mensagem: \"" + mensagem + "\" de " + remetente);
	    }
 
	    public void fazerChamada(String numero) {
	        System.out.println("Fazendo chamada para: " + numero);
	    }

	    public void receberChamada(String numero) {
	        System.out.println("Recebendo chamada de: " + numero);
	    }
 
	    public void tocarMusica(String musica) {
	        System.out.println("Tocando música: " + musica);
	    }

	    public void pausarMusica() {
	        System.out.println("Música pausada.");
	    }

}
