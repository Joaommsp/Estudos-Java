package relacionamentoMuitosMuitos;

public class CursoTeste {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Ana");
		Aluno aluno3 = new Aluno("Carlos");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("JavaScript");
		Curso curso3 = new Curso("Python");
		
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);

		curso2.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno2);
		
		curso3.adicionarAluno(aluno1);
		curso3.adicionarAluno(aluno2);
		
		for (Aluno aluno : curso3.alunos) {
			System.out.println("Estou matriculado no curso " + curso3.nome
					+ " e meu nome é " + aluno.nome
					);
		}
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
