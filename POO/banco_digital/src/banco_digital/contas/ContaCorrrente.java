package banco_digital.contas;

import sistema.SistemaBancario;

public class ContaCorrrente extends SistemaBancario{
	private int agencia;
	private int numero;
	
	public ContaCorrrente(int agencia, int numero) {
		super(saldo);
		this.agencia = agencia;
		this.numero = numero;
		this.setSaldo(numero);
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}


	@Override
	public void depositar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sacar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void verSaldo() {
		// TODO Auto-generated method stub
		
	}
	
}
