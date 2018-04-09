package com.ejecutable.graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Marco extends JFrame{
	
	public Marco() {
		
		setBounds(400, 100, 600, 200);
		setTitle("Generador de claves");	
		Lamina milamina = new Lamina();
		
		add(milamina);
		setVisible(true);
	}
	
	
}


