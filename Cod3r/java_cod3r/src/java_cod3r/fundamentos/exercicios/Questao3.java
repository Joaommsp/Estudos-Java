package java_cod3r.fundamentos.exercicios;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		//Criar um programa que leia o peso e a altura do usuário e
		//imprima no console o IMC.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o peso");
		Double peso = scan.nextDouble();
		
		System.out.println("Insira o altura");
		Double altura = scan.nextDouble();
		
		Double imc = peso/(Math.pow(altura, 2));
		
		System.out.printf("Seu imc é: %.2f", imc);
		
		scan.close();
		
	}
}
