package collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		
		List<Usuario> list = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		
		list.add(u1);
		list.add(new Usuario("Carlos"));
		list.add(new Usuario("joão"));
		list.add(new Usuario("Pedro"));
		list.add(new Usuario("Pedrão"));
		
		System.out.println(list.get(3).nome);
		
		System.out.println(">>>>>" + list.remove(1));
		
		System.out.println("tem? " + list.remove(new Usuario("Manu"))); // true ou false
		
		for (Usuario usuario : list) {
			System.out.println(usuario.nome);
		}
		
	}
}
