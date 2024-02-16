package poo_automoveis;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro("jeep");
		jeep.ligar();
		jeep.setChassi(1224321423);
		
		Moto z400 = new Moto();
		z400.setChassi(324324);
		
		z400.ligar();
		
		Veiculo coringa = jeep;
		
		coringa.ligar();
	}
}
