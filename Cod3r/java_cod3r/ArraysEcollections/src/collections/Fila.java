package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

		public static void main(String[] args) {
			
				Queue<String> fila = new LinkedList<String>();
					
				// Ambos adicionam
				// diferença no comportamento quando a fila está cheia
				fila.add("Ana"); // retorna exceção
				fila.offer("Bia");  // retorna false
				fila.offer("Carlos"); 
				fila.offer("Rafa"); 
				fila.offer("Gui"); 
			
				// Obtem o proximo elemento da fila sem remover
				// diferença no comportamento quando a fila está vazia
				System.out.println(fila.peek()); // retorna false
				System.out.println(fila.peek());
				System.out.println(fila.element()); // lança exceção
				System.out.println(fila.element());
				
				//fila.clear();
				// fila.isEmpty():
				// fila.size();
				// fila.contains(...)
				//remove e imprime
				System.out.println(fila.poll());
				System.out.println(fila.poll());
				// retorna nulo se esiver vazia
				
				
				// retorna uma exceccão se estiver vazia
				System.out.println(fila.remove());
		}
	
}
