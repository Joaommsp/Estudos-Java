package java_cod3r.fundamentos.exercicios;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a base do triangulo");
		Double base = scan.nextDouble();
		
		System.out.println("Insira o altura");
		Double altura = scan.nextDouble();
		
		Double area = (base * altura)/2;
		
		System.out.printf("A área dessse triangulo é: %.2f", area);
		
		scan.close();
	}
}
