import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
  public static void main(String[] args) {
      //os argumentos começam com indice 0

      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      String nome ;
      String sobrenome ;
      int idade ;
      double altura ;

      System.out.println("Digite seu nome");
      nome = scanner.nextLine();

      System.out.println("Digite seu sobrenome");
      sobrenome = scanner.nextLine();

      System.out.println("Digite sua idade");
      idade = scanner.nextInt();

      System.out.println("Digite sua altura");
      altura = scanner.nextDouble();


      System.out.println("Ola, me chamo " + nome + " " + sobrenome);
      System.out.println("Tenho " + idade + " anos ");
      System.out.println("Minha altura é " + altura + "cm ");

      scanner.close();
  }
}