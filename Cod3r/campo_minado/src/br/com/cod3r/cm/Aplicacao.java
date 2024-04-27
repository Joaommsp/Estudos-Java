package br.com.cod3r.cm;

import br.com.cod3r.cm.modelo.Tabuleiro;

public class Aplicacao {

	public static void main(String[] args) {

		System.out.println("Olá");
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);

		System.out.println(tabuleiro);
		
	}
	
}
