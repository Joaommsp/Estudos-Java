package calculadora_media;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		NotasAluno aluno = new NotasAluno();
		
		System.out.println("======Calcular média do Aluno");
		System.out.println("Insira a quandiade de notas");
		aluno.setQuantidadeNotas(scan.nextInt());
		
		for(int i = 0; i < aluno.getQuantidadeNotas() ; i++) {
			System.out.println("Insira a :" + (i + 1) + "ª nota");
			aluno.adicionarNota(scan.nextDouble());
		}
		
		System.out.println("Média do aluno: " + aluno.calcularMedia());
		
		aluno.exibirResultato();
		
		
		scan.close();
	}
}
