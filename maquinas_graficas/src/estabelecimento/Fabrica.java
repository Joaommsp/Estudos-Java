package estabelecimento;

import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.KonikaMinoltaLaser;
import multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		 
		EquipamentoMultifuncional superIMpressora = new EquipamentoMultifuncional();
		
		superIMpressora.copiar();
		superIMpressora.imprimir();
		superIMpressora.digitalizar();
		
	}
}
