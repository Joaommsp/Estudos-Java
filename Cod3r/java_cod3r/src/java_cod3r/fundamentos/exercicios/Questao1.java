package java_cod3r.fundamentos.exercicios;

import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Insira a temperatura em °F");
			Double tempF = scan.nextDouble();
			

			//System.out.println("Insira a temperatura em C°");
			//Double tempC = scan.nextDouble();
			
			Double resultado = (tempF - 32) * 5/9;
			
			System.out.printf("Resultado: %.2f°F", resultado);
		
			scan.close();
	}
}
