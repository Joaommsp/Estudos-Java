package errosemjava;

@SuppressWarnings("serial")
public class AtributoVazio extends RuntimeException{
	
	private String nomeAtributo;
	
	public AtributoVazio(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está vazio.", nomeAtributo);
	}
	
	
}
