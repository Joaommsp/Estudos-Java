package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		
			HashSet conjunto = new HashSet();
			
			conjunto.add(1.2); // double -> Double
			conjunto.add(true); // boolean -> Boolean
			conjunto.add("Teste"); // String
			conjunto.add(1); // int -> Interger
			conjunto.add('x'); // char -> Character
			
			System.out.println("O tamanho é: " + conjunto.size());
			
			conjunto.add("teste"); // t minusculo
			System.out.println("O tamanho é: " + conjunto.size());
			
			conjunto.add("Teste"); // t maiúculo ( não vai pois não aceita repetição)
			System.out.println("O tamanho é: " + conjunto.size());
			
			System.out.println(conjunto.remove("teste")); // true
			System.out.println(conjunto.remove("carro")); // false
			
			System.out.println(conjunto.contains('x')); // True
			System.out.println(conjunto.contains(1)); //true
			System.out.println(conjunto.contains(false)); // false

			Set nums = new HashSet();
			
			nums.add(1);
			nums.add(2);
			nums.add(3);
			
			System.out.println(nums);
			System.out.println(conjunto);
			
			// Fazendo a união
			
			conjunto.addAll(nums);
			System.out.println(conjunto);
			
			
			conjunto.retainAll(nums);
			System.out.println(conjunto);
			
			conjunto.clear();
			System.out.println(conjunto);
	}
}
