package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private int minas;
	
	private final List<Campo> campos = new ArrayList<Campo>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampos();
		assossiarOsVizinhos();
		sortearMinas();
	}

	// i = linha ;; j = colunas
	public void gerarCampos() {
		for(int linha = 0; linha < linhas; linha++) {
			for(int coluna = 0; coluna < colunas; coluna++) {
				campos.add(new Campo(linha, coluna));
			}
		}
	}
	
	public void assossiarOsVizinhos() {
		for(Campo c1: campos) {
			for(Campo c2: campos ) {
				c1.adicionarVizinho(c2);
			}
		}
	}
	
	public void sortearMinas() {
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();
				
		do {
			minasArmadas = campos.stream().filter(minado).count();
			int aleatorio = (int) (Math.random() * campos.size());
			campos.get(aleatorio).minar();
			
		}while (minasArmadas < minas);
		
	}
	
	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(c -> c.objetivoAlcancado()); 
	}

	public void reinicia() {
		campos.stream().forEach(c -> c.reiniciarJogo());
		sortearMinas();
	}
	

    @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		int i = 0;
		for(int l = 0; l < linhas; l++) {
			
			for(int c = 0; c < colunas ; c++) {
				sb.append(" ");
				sb.append(campos.get(i));
				sb.append(" ");
				i++;
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
}

