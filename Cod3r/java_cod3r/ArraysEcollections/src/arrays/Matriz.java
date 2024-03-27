package arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int qtdAlunos;
		int qtdNotas;
		
		System.out.println("Quantos alunos vão ter na turma");
		qtdAlunos = scan.nextInt();
		
		System.out.println("Quantas notas por aluno");
		qtdNotas = scan.nextInt();
		
		double[][] notas = new double[qtdAlunos][qtdNotas];
		
		double notaTotal = 0;
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				
				System.out.println("Informa a nota " + (j+1) + " do aluno " + (i+1));
				notas[i][j] = scan.nextDouble();
				notaTotal += notas[i][j];
			}
		}
		
		double media = notaTotal / (qtdAlunos * qtdNotas);
		System.out.println("Média da turma é "+ media);
		
		
		for(double[] notasDoAluno: notas ) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		scan.close();
		
	}
}
