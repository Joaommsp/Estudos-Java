package escola.aluno.direcao;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(9);
		felipe.setSexo("M");
		
		String nome = felipe.getNome();
		int idade = felipe.getIdade();
		
		System.out.println("O aluno " + nome + " tem " + idade + " anos ");
		//RESULTADO NO CONSOLE
		//O aluno Felipe tem 8 anos 		
	}
}
