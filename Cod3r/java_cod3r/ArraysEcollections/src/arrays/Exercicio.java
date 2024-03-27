package arrays;

import java.util.Arrays;

public class Exercicio {
	 public static void main(String[] args) {
		
		 double[] notasAlunoA = new double[3]; // antes
		 double notasAlunoB[] = new double[2]; // depois
		 
		 double[][] notasBi = new double[2][3];
		 
		 System.out.println(Arrays.toString(notasAlunoA));		 
		 
		 notasAlunoA[0] = 7.9;
		 notasAlunoA[1] = 8;
		 notasAlunoA[2] = 6.7;
		 notasAlunoA[3]= 9.7;
		 
		 System.out.println(Arrays.toString(notasAlunoA));
				 
		 // percorrendo array
		 double total = 0;
		 for(int i = 0; i < notasAlunoA.length ; i++) {
			 total += notasAlunoA[i];
		 }
		 
		 System.out.println(total / 3);
		 
		 double[] notasAunoC = {10, 9.9, 4.3, 6.7};
		 
		 for (int i = 0; i < notasAunoC.length; i++) {
			
		}
	}
}
