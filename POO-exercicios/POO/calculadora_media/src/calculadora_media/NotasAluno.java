package calculadora_media;

import java.util.ArrayList;
import java.util.Scanner;

public class NotasAluno {
	
	private int quantidadeNotas = 0;
	private Double somaNotas = 0.0;
	private ArrayList<Double> notas = new ArrayList<>();
	private Double media = 0.0;
	
	public NotasAluno() {
	
	}

	public int getQuantidadeNotas() {
		return quantidadeNotas;
	}

	public Double getSomaNotas() {
		return somaNotas;
	}

	public void setQuantidadeNotas(int quantidadeNotas) {
		this.quantidadeNotas = quantidadeNotas;
	}

	public ArrayList<Double> getNotas() {
		return notas;
	}

	public void adicionarNota(Double nota) {
		this.somaNotas += nota;
		notas.add(nota);
	}
	
	
	public Double getMedia() {
		return media;
	}

	public Double calcularMedia() {
		return this.media = this.somaNotas / this.quantidadeNotas;
	}
	
	public void exibirResultato() {
		if(this.calcularMedia() >= 7 ) {
			System.out.println("Aluno Aprovado");
		}
		else {
			System.out.println("Aluno reprovado");
		}
	}

	@Override
	public String toString() {
		return "NotasAluno [quantidadeNotas=" + quantidadeNotas + ", somaNotas=" + somaNotas + ", notas=" + notas + "]";
	}
	
	
	
}
