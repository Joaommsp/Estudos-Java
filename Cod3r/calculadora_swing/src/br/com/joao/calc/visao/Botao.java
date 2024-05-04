package br.com.joao.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton{

	public Botao(String texto, Color cor) {
		setText(texto);
		setOpaque(true);
		setBackground(cor);
		setFont(new Font("cuurier", Font.PLAIN, 25));
		setForeground(Color.white);
		setBorder(BorderFactory.createLineBorder(new Color(60, 60, 60)));
	}
	
}
