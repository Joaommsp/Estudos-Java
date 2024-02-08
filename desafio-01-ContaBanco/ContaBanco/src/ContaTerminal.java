import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int numero_conta;
        String agencia;
        String nome_cliente;
        double saldo = 0;

        System.out.println("Por favor, digite o número da Conta.");
        numero_conta = scan.nextInt();
        scan.nextLine(); // Consome o caractere da nova linha

        System.out.println("Por favor, agora insira a agência.");
        agencia = scan.nextLine();

        System.out.println("Por favor , insira seu nome.");
        nome_cliente = scan.nextLine();

        System.out.println("Olá " + nome_cliente + " ,obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + " de conta número " + numero_conta + " e seu saldo atual é de R$ " + saldo);

        scan.close();
    }
}

// ERRO enfrentado :
/*
 * O erro no código fornecido está relacionado ao uso do método nextLine() após
 * o método nextInt(). Quando você utiliza nextInt(), ele lê apenas o número
 * inteiro, mas não consome o caractere de nova linha (Enter) que segue o número
 * na entrada. Portanto, quando você chama nextLine() imediatamente depois, ele
 * consome esse caractere de nova linha restante, em vez de esperar pela próxima
 * entrada do usuário
 */