package java_cod3r.fundamentos;

import java.util.Scanner;

public class StringEquals {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("2" == "2");
	
		
		String s = new String("2");

		System.out.println("2" == s);
		
		System.out.println("2".equals(s));
		
		String s2 = scan.next();
		System.out.println("2".equals(s2));
		
		String s3 = scan.nextLine();
		System.out.println("2".equals(s3));
				
	}
}
