package java_cod3r.fundamentos.exercicios;

import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um valor");
		Double valor = scan.nextDouble();
		
		System.out.printf("Valor ao quadrado: %.2f \n", Math.pow(valor, 2 ));
		System.out.printf("Valor ao cubo: %.2f", Math.pow(valor, 3 ));
		
		scan.close();
		
	}
}	
