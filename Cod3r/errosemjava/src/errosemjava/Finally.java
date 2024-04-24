package errosemjava;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		System.out.println("Olá");
		
		
		Scanner entrada = new Scanner(System.in);
		
		try {			
			System.out.println(7 / entrada.nextInt());
			
		} catch (OutOfMemoryError e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finalmente..."); // O finally sempre é chamado.
			entrada.close();
		}
		
		System.out.println("fim");
		
	}
	
}
