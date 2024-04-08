package heranca.desafio.carros;

import heranca.desafio.Carro;

public class Ferrari extends Carro{

	public Ferrari(String nome, double velocidadeMaxima, double aceleracao, double frenagem) {
		super(nome, velocidadeMaxima, aceleracao, frenagem);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void acelerar() {
		super.acelerar();
	}
	
}
