package java_cod3r.fundamentos;

import java.util.Scanner;

public class DesafioModulo {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número");
		Double num1 = scan.nextDouble();
		
		System.out.println("Insira o segundo número");
		Double num2 = scan.nextDouble();
		
		System.out.println("Insira o a operação");
		String opr = scan.next();
		
		System.out.printf("%.2f %s %.2f = ? \n", num1, opr, num2);
		
		System.out.println("=============seguindo");
		
		//Lógica
		Double resultado = "+".equals(opr) ? num1 + num2 : 0;
		 resultado = "-".equals(opr) ? num1 - num2 : resultado;
		 resultado = "*".equals(opr) ? num1 * num2 : resultado;
		 resultado = "/".equals(opr) ? num1 / num2 : resultado;
		
		 System.out.println("Resultado: " + resultado);
		 
		scan.close();
		
	}
}
