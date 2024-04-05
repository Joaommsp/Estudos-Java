package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoCertinho {
	public static void main(String[] args) {
		
		// Set<String> listaDeAprovados = new HashSet<>();
		
		 SortedSet<String> listaDeAprovados = new TreeSet<>();
		
		listaDeAprovados.add("Lucas");
		listaDeAprovados.add("Pedro");
		listaDeAprovados.add("Carlos");
		listaDeAprovados.add("João");
		
		for (String nome : listaDeAprovados) {
				System.out.println(nome);
		}
		
		SortedSet<Integer> numeros = new TreeSet<Integer>();
		
		numeros.add(1);
		numeros.add(3);
		numeros.add(2);
		
		for (Integer num : numeros) {
			System.out.println(num);
		}
	}
}	
