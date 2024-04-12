package streams;

import java.util.function.UnaryOperator;

public abstract class Utilitarios {

	public static final UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public static final UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	
	
	public static final String gritar(String n) {
		return n + "!!!";
	};
	
}
