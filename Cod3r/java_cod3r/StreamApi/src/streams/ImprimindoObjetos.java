package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("lu", "gui", "Luca", "ana");
		
		for(int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando iterator...");
		
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Stream<String> st = aprovados.stream();
		st.forEach(elemtent -> System.out.println(elemtent));
	}
	
}
