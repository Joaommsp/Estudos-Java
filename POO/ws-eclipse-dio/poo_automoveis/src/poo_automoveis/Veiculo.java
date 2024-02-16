package poo_automoveis;

public abstract class Veiculo {
	private int chassi;

	public int getChassi() {
		return chassi;
	}

	public void setChassi(int chassi) {
		this.chassi = chassi;
	}
	
	public abstract void ligar();
}
