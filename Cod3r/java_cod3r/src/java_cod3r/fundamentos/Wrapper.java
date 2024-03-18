package java_cod3r.fundamentos;

import java.util.Scanner;

public class Wrapper {

		public static void main(String[] args) {
			
			//Scanner entrada = new Scanner(System.in);
			
			// byte 
			Byte b = 100;
			Short s = 1000;
			// Integer i = Integer.parseInt(entrada.next());
			Long l = 100000L;
			Float f = 124.10F;
			System.out.println(f);
			Double d = 13232.123;
			System.out.println(d);
			
			System.out.println(b.byteValue());
			System.out.println(s.toString());
			
			Boolean bol = Boolean.parseBoolean("true");
			System.out.println(bol);
			System.out.println(bol.toString().toUpperCase());
			
			Character c = '#'; // char
			System.out.println(c + "...");
			
		}
	
}
