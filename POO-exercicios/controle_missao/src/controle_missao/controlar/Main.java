package controle_missao.controlar;

public class Main {
	public static void main(String[] args) {
		
		NaveEspacial nave = new NaveEspacial("Apolo 48", Status.SOLO);
		Tripulante tripulante01 = new Tripulante("João", 21, "Piloto");
		Tripulante tripulante02 = new Tripulante("Pedro", 22, "Co-piloto");
		Tripulante tripulante03 = new Tripulante("Ana", 21, "Manutenção");
		
		BaseControle base = new BaseControle("AKM-09", "Estela Tigre Branco", "Comandante Matias");
		
		MissaoEspacial missao = new MissaoEspacial(nave, base);
		
		missao.adicionarTripulante(tripulante01);
		missao.adicionarTripulante(tripulante02);
		missao.adicionarTripulante(tripulante03);
		
		missao.atualizarStatus(Status.ORBITA);
		
		System.out.println(missao);
				
	}
}
