package sistema;

public enum Contas {
	CORRENTE("Corrente"), 
	POUPANCA("Poupanca");
	
	  private String tipoDaConta;
	  
	  Contas(String tipoDaConta) {
		  this.tipoDaConta = tipoDaConta;
	  }
	  
	  public String getTipoDaConta() {
		  return this.tipoDaConta;
	  }
	  
}
