package heranca.desafio.teste;

import heranca.desafio.Carro;
import heranca.desafio.carros.Civic;
import heranca.desafio.carros.Ferrari;

public class Testes {

	public static void main(String[] args) {
		
		Carro c = new Civic("Civic", 198, 5, 5);
		
		Carro c2 = new Ferrari("Italia 458", 298, 15, 20);
		
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();

		c2.frear();
		
		c.acelerar();
		
		c.acelerar();
		
		c.acelerar();
		
		c.acelerar();
		
		c.acelerar();
		
		System.out.println(c2.getVelocidade());
		System.out.println(c.getVelocidade());
		
	}
	
}
