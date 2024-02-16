package enums;

public class SistemaIbge {	
		public static void main(String[] args) {
			for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
				System.out.println(e.getSigla() + " - " + e.getNome());
			}
			
			EstadoBrasileiro eb = EstadoBrasileiro.BAHIA;
			System.out.println("BAHIA NOME = " + eb.getNome());
			System.out.println("BAHIA SIGLA = " + eb.getSigla());
			System.out.println("BAHIA IBGE = " + eb.getIbge());
		}
}
