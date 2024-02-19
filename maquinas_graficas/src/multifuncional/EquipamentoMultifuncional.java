package multifuncional;

import equipamentos.impressora.Impressora;
import esquipamento.digitalizadora.Digitsalizadora;
import esquipamentos.copiadora.Copiadora;

public class EquipamentoMultifuncional implements Copiadora, Digitsalizadora, Impressora{
	public void copiar() {
		System.out.println("COPIANDO VIA EQUIP MULTIFUNCIONAL");
	}
	
	public void digitalizar() {
		System.out.println("DIGITALIZANDO VIA EQUIP MULTIFUNCIONAL");
	}
	
	public void imprimir() {
		System.out.println("IMPRIMINDO VIA EQUIP MULTIFUNCIONAL");
	}
 }
