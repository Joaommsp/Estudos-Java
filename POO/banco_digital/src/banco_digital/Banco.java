package banco_digital;

import banco_digital.contas.ContaCorrrente;
import banco_digital.contas.ContaPoupanca;
import cliente.Cliente;

public class Banco {
	
	public static void main(String[] args) {
		
		Cliente cliente01 = new Cliente("João");
		Cliente cliente02 = new Cliente("Pedro");
		
		ContaCorrrente conta01 = new ContaCorrrente(cliente01);
		ContaCorrrente conta02 = new ContaCorrrente(cliente02);
		ContaPoupanca conta03 = new ContaPoupanca(cliente01);
		
		conta03.depositar(123);
		conta03.retirar(100);
		
		conta01.depositar(1000);
		System.out.println("saldo:" + conta01.getSaldo());	
		System.out.println("Agencia: " + conta01.getAgencia()); 
		System.out.println("Agencia: " + conta02.getAgencia() + "\n"); 
		
		conta01.imprimirStatus();
		
		conta03.imprimirStatus();
		
		conta01.transferir(100, conta03);
		
		conta03.imprimirStatus();
	}
	
}
