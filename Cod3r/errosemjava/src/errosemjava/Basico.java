package errosemjava;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			ImpriprirAluno(a1);
		} catch (Exception excecao) {
			System.out.println("Erro ao imprimir usuário");
		}
		
		DividirPorZero();
		
	}
	
	public static void DividirPorZero() {
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) {
			System.out.println("Erro ao dividir: " + e.getMessage());
		}
	}
	
	public static void ImpriprirAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
	
}
