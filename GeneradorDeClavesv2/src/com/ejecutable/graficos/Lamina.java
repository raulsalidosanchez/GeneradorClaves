package com.ejecutable.graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.generador.GeneradorClaves;

public class Lamina extends JPanel{
	
	private JButton boton;
	JTextField texto;
	JPanel laminaBotones;
	
	public Lamina() {
		setLayout(new BorderLayout());
		
		GeneradorClaves gc = new GeneradorClaves();
		String res = gc.GenerarClave();
		texto = new JTextField("Su clave auto generada es: "+res);
		texto.setFont(new Font("Arial", Font.BOLD, 20));
		texto.setEditable(false);
		texto.setBorder(null);
		texto.setHorizontalAlignment(texto.CENTER);
		add(texto, BorderLayout.CENTER);
		
		laminaBotones = new JPanel();
		
		boton = new JButton("Actualizar");
		boton.setSize(50, 50);
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String res = gc.GenerarClave();
				texto.setText("Su clave auto generada es: "+res);
				
			}
		});
		
		laminaBotones.add(boton);
		add(laminaBotones, BorderLayout.SOUTH);
	}
	
	
}
