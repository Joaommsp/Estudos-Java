package sistema;

public class SistemaBancario {
	
	public double saldo;
		
	 public abstract void  depositar();
	 public abstract void  sacar();
	 public abstract void 	verSaldo();
	 
	public SistemaBancario(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
		
}
