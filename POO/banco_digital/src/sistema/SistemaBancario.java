package sistema;

public class SistemaBancario {
	
	private double saldo = 0;
	 
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
		
	public void depositar(double deposito) {
		 this.saldo += deposito;
		 System.out.println("Depositou");
	}
	
	public void retirar(double retirada) {
		if (retirada <= saldo) {
			this.saldo -= retirada;
			 System.out.println("retirou");
		} else {
			System.out.println("Saldo insuficiente para retirada.");
		}
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.retirar(valor);
		contaDestino.depositar(valor);
	}
	
}
