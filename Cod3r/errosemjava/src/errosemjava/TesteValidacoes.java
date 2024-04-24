package errosemjava;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", 7);
			
			Validar.aluno(aluno);
			Validar.aluno(null);
			
		} catch (NumeroForaIntervalo e) {
			System.out.println(e.getMessage());
		} catch(AtributoVazio e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("FIM :)");
		
	}
	
}
