package banco_digital.contas;

import cliente.Cliente;
import sistema.Conta;
import sistema.Contas;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente nomeCliente) {
		super(nomeCliente);
		super.tipodeConta = Contas.POUPANCA;
	}
	
	
}
