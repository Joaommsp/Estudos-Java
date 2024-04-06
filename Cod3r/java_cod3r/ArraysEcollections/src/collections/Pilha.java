package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
		
	public static void main(String[] args) {
		
			Deque<String> livros = new ArrayDeque<String>();
			
			livros.add("O pequeno príncipe");
			livros.push("Vida de cachorro");
			livros.push("Senhor dos anéis");
			
			System.out.println(livros.peek());
			System.out.println(livros.element());
			
			System.out.println(livros.poll());
			System.out.println(livros.remove());
			System.out.println(livros.pop());
			
			//livros.size()
			//livros.clear()
			//livros.contains()
			//livros.isEmpty()
			
			for (String livro : livros) {
				System.out.println(livro);
			}
		
	}
}
