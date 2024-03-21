package java_cod3r.fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringToNum {
    public static void main(String[] args) {
        // Corrigindo a linha para usar JOptionPane corretamente
        String valor1 = JOptionPane.showInputDialog("Digite um valor:");
        
        // Agora você pode usar valor1 como uma String
        System.out.println("Valor digitado: " + valor1);
    }
}