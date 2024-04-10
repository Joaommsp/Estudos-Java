package heranca.desafio;

public interface Esportivo {

	void ligarTurbo();
	abstract void desligarTurbo();
	
	default int superCharge() {
		return 1;
	}
	
}
