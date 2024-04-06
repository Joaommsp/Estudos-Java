package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
			// chave , valor
		
		usuarios.put(1, "João"); // adiciona
		usuarios.put(1, "Pedro"); // altera
		usuarios.put(1, "Bárbara");
		usuarios.put(2, "Bárbara");
		usuarios.put(3, "Bárbarazinha");
		usuarios.put(4, "Bárbarazinha");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); // chaves
		System.out.println(usuarios.values()); // valores
		System.out.println(usuarios.entrySet()); //chaves e valores
		
		System.out.println(usuarios.containsKey(1));
		System.out.println(usuarios.containsValue("Bárbara"));
		
		System.out.println(usuarios.get(1));
		System.out.println(usuarios.remove(4)); // pode remover a partir da chave ou a partire da chave e valor
		System.out.println(usuarios.remove(2, "Bárbara"));
		
		for (String nomes : usuarios.values()) {
			System.out.println(nomes);
		}
		
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey() + "===: ");
			System.out.println(registro.getValue());
		}
	}
	
}
