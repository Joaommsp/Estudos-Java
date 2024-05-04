package br.com.joao.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.joao.calc.modelo.Memory;

@SuppressWarnings("serial")
public class Display extends JPanel{

	private JLabel label;
	
	public Display() {
		setBackground(new Color(32, 32, 32));
		label = new JLabel(Memory.getInstancia().getTextoAtual());
		label.setForeground(Color.white);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
		
		add(label);
	}
	
}
