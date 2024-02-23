package veiculos.automoveis;

import veiculo.Veiculo;

public class Caminhao extends Veiculo {
	private int eixos;

	public Caminhao() {
	}

	public Caminhao(String modelo, String placa, int ano, int eixos) {
		super(modelo, placa, ano);
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	@Override
	public void exibirDados() {
		System.out.println("Caminhão modelo" + this.getModelo() + " placa " + this.getPlaca()  + " com " + this.getEixos() + " eixos");
	}
	
}
