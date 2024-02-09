import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // // salario base maior que salario pretendido
        // analisarCandidato(2000.0, 1900.0);

        // // salario base igual que salario pretendido
        // analisarCandidato(2000.0, 2000.0);

        // // salario base igual que salario pretendido
        // analisarCandidato(1900.0, 2000.0);

        // selecaoCandidatos();
        // imprimirSelecionados();
        ligarParaCandidato();
    }

    static void ligarParaCandidato() {
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };
        int tentativas = 0;
        Boolean contatoRealizado = false;

        for (String candidato : candidatos) {

            for (int i = 0; i < 3; i++) {
                int resposta = ThreadLocalRandom.current().nextInt(0, 5);
                // System.out.println("resposta: " + resposta);
                if (resposta == 1) {
                    tentativas++;
                    contatoRealizado = true;
                    break;
                } else {
                    tentativas++;
                    contatoRealizado = false;
                }
            }

            if (contatoRealizado) {
                System.out.println(
                        "CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + " após " + tentativas + " tentativas");
            } else {
                System.out.println(
                        "NÃO CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato);
            }

            tentativas = 0;

        }

    }

    static void imprimirSelecionados() {
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato n°" + (i + 1) + " é " + candidatos[i]);
        }

        System.out.println("Forma abreviada de interação forEach");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionando foi: " + candidato);
        }

    }

    static void selecaoCandidatos() {
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatoAtual < candidatos.length && candidatosSelecionados < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou: " + salarioPretendido + " de salário.");

            if (salarioPretendido <= salarioBase) {
                System.out.println("O candidato " + candidato + " foi selecionado.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
        System.out.println("N º de Candidatos selecionados: " + candidatosSelecionados);
    }

    // Método que simula o valor pretendido

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioBase, double salarioPretendido) {

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
