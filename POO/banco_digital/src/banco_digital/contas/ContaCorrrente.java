package banco_digital.contas;

import cliente.Cliente;
import sistema.Conta;
import sistema.Contas;
import sistema.SistemaBancario;

public class ContaCorrrente extends Conta{

	public ContaCorrrente(Cliente nomeCliente) {
		super(nomeCliente);
		super.tipodeConta = Contas.CORRENTE;
	}
	
	
}
