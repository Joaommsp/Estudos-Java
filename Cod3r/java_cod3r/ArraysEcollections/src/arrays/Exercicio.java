package arrays;

import java.util.Arrays;

public class Exercicio {
	 public static void main(String[] args) {
		
		 double[] notasAlunoA = new double[4]; // antes
		 double notasAlunoB[] = new double[2]; // depois
		 
		 double[][] notasBi = new double[2][3];
		 
		 System.out.println(Arrays.toString(notasAlunoA));		 
		 
		 notasAlunoA[0] = 7.9;
		 notasAlunoA[1] = 8;
		 notasAlunoA[2] = 6.7;
		 notasAlunoA[3]= 9.7;
		 
		 System.out.println(Arrays.toString(notasAlunoA));
		 System.out.println(notasAlunoA[notasAlunoA.length -1]); //pegando o último elemento do Array
				 
		 // percorrendo array
		 double totalAlunoA = 0;
		 for(int i = 0; i < notasAlunoA.length ; i++) {
			 totalAlunoA += notasAlunoA[i];
		 }
		 
		 System.out.println(totalAlunoA / 3);
		 
		 double[] notasAunoC = {10, 9.9, 4.3, 6.7};
		 
		 double totalAlunoC = 0;
		 for (int i = 0; i < notasAunoC.length; i++) {
			totalAlunoC += notasAunoC[i];
		}
		 
		System.out.println(totalAlunoC / notasAunoC.length);
	}
}
