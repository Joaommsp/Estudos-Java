package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

// usar filter & map

public class DesafioFilter {

	public static void main(String[] args) {
		
		Carros c1 = new Carros("Civic", 4); 
		Carros c2 = new Carros("Camaro", 8); 
		Carros c3 = new Carros("Mustang", 8); 
		Carros c4 = new Carros("Corolla", 4); 
		Carros c5 = new Carros("Ranger", 6); 
		Carros c6 = new Carros("Veyron", 12); 
		Carros c7 = new Carros("Gallardo", 10); 
		Carros c8 = new Carros("300c", 8); 
		Carros c9 = new Carros("Charger", 8);

		List<Carros> carros = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9);
		
		Predicate<Carros> motorV8 = c -> c.getQtdCilintros() == 8;
		Function<Carros, String> veiculoNome = c -> c.getNome();  
		
		carros.stream()
		.filter(motorV8)
		.map(veiculoNome)
		.forEach(veiculo -> System.out.println(veiculo));
		
	}
	
}
