package polimorfismo;

public class Jantar {
	
		public static void main(String[] args) {
			
				Pessoa convidadeo = new Pessoa(99.7);
				
				Arrozs ingrediente1 = new Arrozs(0.250);
				Feijao ingrediente2 = new Feijao(0.180);
				
				System.out.println(convidadeo.getPeso());
				
				convidadeo.comer(ingrediente1);
				convidadeo.comer(ingrediente2);
				
				System.out.println(convidadeo.getPeso());
				
				Sorvete sobremesa = new Sorvete(0.4);
				convidadeo.comer(sobremesa);
				System.out.println(convidadeo.getPeso());
				
			
		}
	
}
