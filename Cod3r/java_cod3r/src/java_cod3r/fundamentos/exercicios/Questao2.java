package java_cod3r.fundamentos.exercicios;

import java.util.Scanner;

public class Questao2 {
		public static void main(String[] args) {
			
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Insira a temperatura em °C");
				Double tempC = scan.nextDouble();
				

				//System.out.println("Insira a temperatura em C°");
				//Double tempC = scan.nextDouble();
				
				Double resultado = (tempC * 1.8) + 32;
				
				System.out.printf("Resultado: %.2f°F", resultado);
			
				scan.close();
		}

}
