package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioMap {

	public static void main(String[] args) {
		
		Consumer<Object> println = System.out::println;
		
		List<Integer> nums = Arrays.asList(1, 2, 3 ,4 ,5 ,6 ,7 ,8 ,9);
		
		nums.stream()
		 .map(n -> Integer.toBinaryString(n))
		 .map(s ->  {
			 StringBuilder reversed = new StringBuilder(s).reverse();
			 
			 return reversed;
		 })
		 .map(r -> {
			 int decimal = Integer.parseInt(r.toString(), 2);
			 return decimal;
		 })
		 .forEach(println);;
		
		
		
	}
	
}
