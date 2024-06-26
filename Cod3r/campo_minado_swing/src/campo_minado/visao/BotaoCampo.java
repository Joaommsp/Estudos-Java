package campo_minado.visao;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import campo_minado_swing.game.Campo;
import campo_minado_swing.game.CampoEvento;
import campo_minado_swing.game.CampoObservador;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObservador, MouseListener{

	private final Color BG_PADRAO = new Color(184, 184, 184);
	private final Color BG_MARCAR = new Color(9, 179, 247);
	private final Color BG_EXPLODIR = new Color(189, 66, 68);
	private final Color TEXTO_VERDE = new Color(0, 100, 0);
	
	private Campo campo;
	
	public BotaoCampo(Campo campo) {
		this.campo = campo;
		setBackground(BG_PADRAO);
		setOpaque(true);
		setBorder(BorderFactory.createBevelBorder(0));
		
		addMouseListener(this);
		campo.registrarObServador(this);
	}

	@Override
	public void eventoOcorreu(Campo c, CampoEvento evento) {
		switch (evento) {
		case ABRIR: {
			aplicarEstiloAbrir();
			break;
		}
		case MARCAR: {
			aplicarEstiloMarcar();
			break;
		}
		case EXPLODIR : {
			aplicarEstiloExplodir();
			break;
		}
		default:
			aplicarEstiloPadrao();
		}
		
		SwingUtilities.invokeLater(() -> {
			repaint();
			validate();
		});
	}

	private void aplicarEstiloPadrao() {
		setBackground(BG_PADRAO);
		setBorder(BorderFactory.createBevelBorder(0));
		setText("");
	}

	private void aplicarEstiloExplodir() {
		// TODO Auto-generated method stub
		setBackground(BG_EXPLODIR);
		setForeground(Color.white);
		setText("X");
	}

	private void aplicarEstiloMarcar() {
		// TODO Auto-generated method stub
		setBackground(BG_MARCAR);
		setForeground(Color.black);
		setText("M");
	}

	private void aplicarEstiloAbrir() {
		
		setBorder(BorderFactory.createLineBorder(Color.gray));
		
		if(campo.isMinado()) {
			setBackground(BG_EXPLODIR);
			return;
		}
		
		setBackground(BG_PADRAO);
		
		switch (campo.minasNaVizinhanca()) {
		case 1: 
			setForeground(TEXTO_VERDE);
			break;
		case 2: 
			setForeground(Color.blue);
			break;
		case 3: 
			setForeground(Color.yellow);
			break;
		case 4: 
		case 5: 
		case 6: 
			setForeground(Color.RED);
			break;
		default:
			setForeground(Color.pink);
		}
		
		String valor = !campo.vizinhancaSegura() ? 
				campo.minasNaVizinhanca() + "" : "";
		setText(valor);
	}
	
	// Interface dos eventos do mouse
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getButton() == 1) {
			campo.abrir();
		}else {
			campo.alternarMarcacao();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
		
	
	
}
