package java_cod3r.fundamentos.exercicios;

import java.util.Scanner;

public class Questao6 {
	
	public static void main(String[] args) {

		Double a = 2.0;
		Double b = -5.0;
		Double c = 2.0;
		
		Double delta = Math.pow(b, 2) - (4*a*c);
		
		if(delta > 0) {
			System.out.println("Dois soluções reais");
		}
		else if(delta == 0) {
			System.out.println("Uma solução real");
		}
		else {
			System.out.println("sem solução");
		}
		
		System.out.println(delta);
		
		Double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		Double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("X1 = " + x1);
		System.out.println("X2 = " + x2);
		
	}

}
