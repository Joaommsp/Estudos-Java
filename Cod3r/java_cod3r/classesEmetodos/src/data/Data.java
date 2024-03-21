package data;

public class Data {

	int dia = 1;
	int mes = 1;
	int ano = 1970;	
		
	public Data() {
		super();
	}

	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
	}
	
}
