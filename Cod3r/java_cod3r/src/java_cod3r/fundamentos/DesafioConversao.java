package java_cod3r.fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String salario1 = "";
		String salario2 = "";
		String salario3 = "";
		Double media = 0.0;
		
		System.out.println("Qual o primeiro salário");
		salario1 = scan.nextLine();

		System.out.println("Qual o segundo salário");
		salario2 = scan.nextLine();

		System.out.println("Qual o terceiro salário");
		salario3 = scan.nextLine();
		
		media = (Double.parseDouble(salario1.replaceAll(",", ".")) + 
				Double.parseDouble(salario2.replaceAll(",", ".")) +
				Double.parseDouble(salario3.replaceAll(",", ".")))/3;
	
		System.out.println("média: " + media);
	}
	
}
