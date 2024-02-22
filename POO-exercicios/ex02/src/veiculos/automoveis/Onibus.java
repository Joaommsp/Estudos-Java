package veiculos.automoveis;

import veiculo.Veiculo;

public class Onibus extends Veiculo {
	private int assentos;

	public Onibus() {
		
	}

	public Onibus(String modelo, String placa, int ano, int assentos) {
		super(modelo, placa, ano);
		this.assentos = assentos;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
	
	@Override
	public void exibirDados() {
		System.out.println("Onibus modelo" + this.getModelo() + " placa " + this.getPlaca()  + " com " + this.getAssentos() + " assentos");
	}
	
}
