package atribuicao_referencia;

public class AtribuicaoEreferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data("1", "2", "3");
		Data d2 = d1; // Atribuição por referência (Objeto)
		
		d1.mes = "31";
		d2.dia = "12";
		
		d1.ano = "2025";
		d2.ano= "2045";
		
		d1.obterData();
		d2.obterData();
		
		voltarDataPadrao(d2);
		
		d1.obterData();
		d2.obterData();
		
		int n = 4;
		aumenta(n);
		System.out.println(n);
			
	}
	
	static void voltarDataPadrao(Data d) {
		d.dia = "0";
		d.ano = "0";
		d.mes = "0";
	}
	
	static void aumenta(int num) {
		num++;
		System.out.println(num);
	}
	
}
