package heranca.desafio;

public class Carro {
	
	private String nome;
	final private double VELOCIDADE_MAXIMA;
	private double velocidade = 0;
	private double aceleracao = 5;
	private double frenagem = 5;
	
	public Carro(String nome, double velocidadeMaxima, double aceleracao, double frenagem) {
		super();
		this.nome = nome;
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
		this.aceleracao = aceleracao;
		this.frenagem = frenagem;
	}

	public String getNome() {
		return nome;
	}

	public double getVelocidade() {
		return velocidade;
	}


	public void acelerar() {
		
		this.velocidade += aceleracao;
		
		if(velocidade >= VELOCIDADE_MAXIMA) {
			this.velocidade = this.VELOCIDADE_MAXIMA;
		}
	}
		
	public void frear(){
			if(velocidade <= 0) {
				this.velocidade = 0;
			}
			else {
				this.velocidade -= frenagem;
			}
		
	}
	
	
	
	
}
