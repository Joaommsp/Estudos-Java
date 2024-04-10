package heranca.desafio;

public class Ferrari extends Carro implements Esportivo{

	public Ferrari(String nome, double velocidadeMaxima, double aceleracao, double frenagem) {
		super(nome, velocidadeMaxima, aceleracao, frenagem);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ligarTurbo() {
		this.setVelocidade(400);
	}

	@Override
	public void desligarTurbo() {
		// TODO Auto-generated method stub
		
	}

}
