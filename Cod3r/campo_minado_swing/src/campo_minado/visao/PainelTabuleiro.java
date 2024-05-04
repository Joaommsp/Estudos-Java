package campo_minado.visao;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import campo_minado_swing.game.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel{

	public PainelTabuleiro(Tabuleiro tabuleiro) {
		
		setLayout(new GridLayout(
				tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
		
		tabuleiro.registrarObservador(e -> {
			//TODO mostrar resultado pro usuário !
			
			SwingUtilities.invokeLater(() -> {
				if(e.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Ganhou");
				}else {
					JOptionPane.showMessageDialog(this, "PerdeuKKKKKKKKKKKKKKKKKKKKKK");
				}
				
				tabuleiro.reinicia();
			});
		});
		
	}
	
}
