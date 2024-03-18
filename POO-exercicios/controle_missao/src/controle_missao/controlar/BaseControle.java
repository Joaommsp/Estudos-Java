package controle_missao.controlar;

public class BaseControle {
	
	private String nome;
	private String localizacao;
	private String responsavel;
	
	public BaseControle(String nome, String localizacao, String responsavel) {
		super();
		this.nome = nome;
		this.localizacao = localizacao;
		this.responsavel = responsavel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
		
		
}
