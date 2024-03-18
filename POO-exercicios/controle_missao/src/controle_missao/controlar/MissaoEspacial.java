package controle_missao.controlar;

import java.util.ArrayList;
import java.util.List;

public class MissaoEspacial {
	
	private NaveEspacial naveMissao;
	private List<Tripulante> tripulantes = new ArrayList<>();
	private BaseControle baseMissao;
	
	public MissaoEspacial(NaveEspacial naveMissao, BaseControle baseMissao) {
		super();
		this.naveMissao = naveMissao;
		this.baseMissao = baseMissao;
		
		this.naveMissao.setQtdTripulantes(tripulantes.size());
	}

	public NaveEspacial getNaveMissao() {
		return naveMissao;
	}

	public void setNaveMissao(NaveEspacial naveMissao) {
		this.naveMissao = naveMissao;
	}

	public List<Tripulante> getTripulantes() {
		return tripulantes;
	}

	public BaseControle getBaseMissao() {
		return baseMissao;
	}

	public void adicionarTripulante(Tripulante novoTripulante) {
		tripulantes.add(novoTripulante);
		this.naveMissao.setQtdTripulantes(tripulantes.size());
	}

	public void atualizarStatus(Status novoStatus) {
		this.naveMissao.setStatus(novoStatus);
	}

	@Override
	public String toString() {
		return "MissaoEspacial [naveMissao=" + naveMissao.getNome() + ", tripulantes=" + tripulantes.size() + ", baseMissao="
				+ baseMissao.getNome() + "]";
	}
	
	
}
