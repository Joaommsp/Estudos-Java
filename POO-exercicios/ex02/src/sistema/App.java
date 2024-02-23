package sistema;

import java.util.ArrayList;

import veiculo.Veiculo;
import veiculos.automoveis.Caminhao;
import veiculos.automoveis.Onibus;

public class App {
	public static void main(String[] args) {
		
			ArrayList<Onibus> onibus = new ArrayList<Onibus>();
			onibus.add(new Onibus("Paradiso 1800", "ABC123", 2022, 30));
			onibus.add(new Onibus("G7 1600LD", "DEF456", 2023, 35));
			onibus.add(new Onibus("Paradiso G7 1200", "GHI789", 2021, 40));
			onibus.add(new Onibus("S 3.80", "JKL012", 2020, 45));
			onibus.add(new Onibus("DD G7 1800", "MNO345", 2019, 50));
			onibus.add(new Onibus("S 4.15", "PQR678", 2018, 55));
			onibus.add(new Onibus("G7 1200", "STU901", 2017, 60));
			onibus.add(new Onibus("Comil Campione DD", "VWX234", 2016, 65));
			onibus.add(new Onibus("G7 1800 DD", "YZA567", 2015, 70));
			onibus.add(new Onibus("G7 1050", "BCD890", 2014, 75));
			
			for(Onibus modelo: onibus){
				modelo.exibirDados();
			}
	}
}
