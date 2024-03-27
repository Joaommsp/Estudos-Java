package arrays.desafio01;

import java.util.Iterator;
import java.util.Scanner;

public class CalculoDeMedia {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] notas = new double[4];
		double somaNotas = 0;
		
		int index = 0;
		for (double nota : notas) {
			System.out.println("Insira a " + (index + 1) + "° nota");
			notas[index] = scan.nextDouble();
			index++;
		}
		
		index = 0;
		for (double nota : notas) {
			System.out.println("Nota " + (index+1) + ": " + nota);
			index++;
		}
		
		for(double nota : notas) {
			somaNotas += nota;
		}
		
		System.out.println("Média do aluno: " + (somaNotas/notas.length));
		
		scan.close();
	}
}
