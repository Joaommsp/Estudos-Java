package arrays;

public class EqualsHashCode {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("João", "jmmsp2003@gamil.com");
		Usuario u2 = new Usuario("João", "jmmsp2003@gamil.com");
		
		System.out.println(u1 == u2); // false
		System.out.println(u1.equals(u2));
		
		System.out.println(u1 == u1); // true ( mesmo endereço )
		
	}
	
	// O hashCode será abordado em outra aula
	
}

