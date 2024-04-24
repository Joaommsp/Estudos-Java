package errosemjava;

@SuppressWarnings("serial")
public class NumeroForaIntervalo extends RuntimeException{
	
	private String nomeAtributo;
	
	public NumeroForaIntervalo(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo.", nomeAtributo);
	}
	
	
}
