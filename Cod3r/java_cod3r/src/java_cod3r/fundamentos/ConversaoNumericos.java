package java_cod3r.fundamentos;

public class ConversaoNumericos {
	public static void main(String[] args) {
		
		double a = 1; // implicita 
		System.out.println(a);
		
		float b = (float) 1.02355325325325235; //explicita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte)c;
		
		double e = 1.04354;
		int f = (int) e; //explicita (CAST)
		System.out.println(f);
	}
}
