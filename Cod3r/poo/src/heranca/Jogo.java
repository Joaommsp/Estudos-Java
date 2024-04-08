package heranca;

public class Jogo {

		public static void main(String[] args) {
			
			Vilao j1 = new Vilao();
			j1.x = 10;
			j1.y = 10;
			
			Heroi j2 = new Heroi(10, 11);
		
			System.out.println(j1.vida);
			System.out.println(j2.vida);
			
			j1.atacar(j2);
			j2.atacar(j1);
			j1.atacar(j2);
			j2.atacar(j1);
			j1.atacar(j2);
			
			j1.andar(Direcao.NORTE);
			j2.atacar(j1);
			
			
			System.out.println("vilão tem : " + j1.vida);
			System.out.println("Heroi tem: " + j2.vida);	
			
		}
	
}
