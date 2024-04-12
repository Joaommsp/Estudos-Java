package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Filter {

	public static void main(String[] args) {
		
		Consumer<Object> println = System.out::println;
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Pedro", 9.8);
		Aluno a3 = new Aluno("João", 6.8);
		Aluno a4 = new Aluno("Bárbara", 10.0);
		Aluno a5 = new Aluno("Matheus", 9.8);
		Aluno a6 = new Aluno("Arthur", 4.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno>aprovado = a -> a.nota >= 7;
		
		Stream<Aluno> alunosAprovados = alunos.stream().filter(aprovado);
		
		alunosAprovados.forEach(println);
	}
	
}
