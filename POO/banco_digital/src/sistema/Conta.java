package sistema;

import cliente.Cliente;

public class Conta extends SistemaBancario{
	
	protected Contas tipodeConta;
	protected Cliente nomeCliente;
	protected int agencia = (int) (Math.random() * (1000 - 1 + 1) + 1);
	protected int numero =  (int) (Math.random() * (300 - 1 + 1) + 1);
	
	public Conta(Cliente nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}
	
	public Contas getConta() {
		return this.tipodeConta;
	}
	
	public void imprimirStatus() {
		System.out.println("Status da conta:\n"
				+ "Titular: " + this.nomeCliente.getNome() + "\n"
				+ "Tipo da conta: " + this.getConta() + "\n"
				+ "Agencia: " + this.getAgencia() + "\n"
				+ "Conta: " + this.getNumero() + "\n"
				+ "Saldo: " + this.getSaldo()
				);
	}
	
	
	
}