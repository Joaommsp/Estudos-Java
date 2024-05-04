package campo_minado_swing.game;

import java.util.ArrayList;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Tabuleiro implements CampoObservador{

	private final int linhas;
	private final int colunas;
	private final int minas;
	
	private final List<Campo> campos = new ArrayList<Campo>();
	private final List<Consumer<ResultadoEvento>> observadores =
			new ArrayList<>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampos();
		assossiarOsVizinhos();
		sortearMinas();
	}
	
	public void paraCadaCampo(Consumer<Campo> funcao) {
		campos.forEach(funcao);
	}
	
	public void registrarObservador(Consumer<ResultadoEvento> observador) {
		observadores.add(observador);
	}

	private void notificarObservadores(boolean resultado) {
		observadores.stream().
		forEach(o -> o.accept(new ResultadoEvento(resultado)));
	}
	
	public void abrir(int linha, int coluna) {
	try {
		campos.parallelStream()
		.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
		.findFirst()
		.ifPresent(c -> c.abrir());
		;
	} catch (Exception e) {
		// FIXME ajuidar a implementação do método abrir
		campos.forEach(c -> c.setAberto(true));
		throw e;
	}
	}

	public void alterarMarcacao(int linha, int coluna) {
		campos.parallelStream()
		.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
		.findFirst()
		.ifPresent(c -> c.alternarMarcacao());
		;
	}
	
	// i = linha ;; j = colunas
	public void gerarCampos() {
		for(int linha = 0; linha < linhas; linha++) {
			for(int coluna = 0; coluna < colunas; coluna++) {
				Campo campo = new Campo(linha, coluna);
				campo.registrarObServador(this);
				campos.add(campo);
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
	public void eventoOcorreu(Campo c, CampoEvento evento) {
		
		if(evento == CampoEvento.EXPLODIR) {
			mostrarMinas();
			notificarObservadores(false);
		}
		else if(objetivoAlcancado()) {
			notificarObservadores(true);
		}
		
	}
	
	private void mostrarMinas() {
		campos.stream()
			.filter(c -> c.isMinado())
			.filter(c -> !c.isMarcado())
			.forEach(c -> c.setAberto(true));
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
	
	
}

