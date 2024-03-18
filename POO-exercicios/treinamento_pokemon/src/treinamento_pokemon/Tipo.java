package treinamento_pokemon;

public enum Tipo {
	
	 FOGO("Fogo"),
	 AGUA("Agua"),
	 ELETRICO("Eletrico"),
	 TERRA("Terra"),
	 PREDADOR("Predador")
	 ;
	 
	  private String nome;

	    Tipo(String nome) {
	        this.nome = nome;
	    }

	    public String getNome() {
	        return nome;
	    }
	    
}
