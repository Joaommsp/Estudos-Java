package poo_automoveis;

public class Carro extends Veiculo {
	
	private String modelo;
	
	public Carro(String modelo) {
		this.modelo = modelo;
	}
	
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public void ligar() {
		confereCombustivel();
		conferirCambio();
		System.out.println("CARRO LIGADO");
	}
	
	private void confereCombustivel() {
		System.out.println("Conferindo combustível");
	}
	
	private void conferirCambio() {
		System.out.println("Conferindo cambio");
	}
}
