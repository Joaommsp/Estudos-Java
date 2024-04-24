package errosemjava;

public class ChecadaVSNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());;
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());;
		}
		
		System.out.println("Fim :)");
		
	}
	
	// Exceção NÃO checada NÃO verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}
	
	// Exceção checada ou verificada
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal #02!");
	}
}
