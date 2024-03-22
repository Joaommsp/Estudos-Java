package atribuicao_referencia;

public class Data {

	String dia;
	String ano;
	String mes;
	
	public Data(String dia, String ano, String mes) {
		super();
		this.dia = dia;
		this.ano = ano;
		this.mes = mes;
	}
	
	public void obterData() {
		System.out.println(dia + " " + ano + " " + mes);
	}
	
	
}

