package br.com.joao.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{

	 public Calculadora() {
		 
		 organizarLaylout();
		 
		 setSize(324, 504);
		 setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		 setLocationRelativeTo(null);
		 setVisible(true);
	}
	 
	 private void organizarLaylout() {
		 setLayout(new BorderLayout());
		 
		 Display display = new Display();
		 display.setPreferredSize(new Dimension(324, 104));
		 add(display, BorderLayout.NORTH);
		 
		 Teclado teclado = new Teclado();
		 add(teclado, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		
		 new Calculadora();
		 
	}
	
}
