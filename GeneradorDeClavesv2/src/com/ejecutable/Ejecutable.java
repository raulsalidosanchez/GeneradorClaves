package com.ejecutable;

import javax.swing.JFrame;

import com.ejecutable.graficos.Marco;

public class Ejecutable {
	
	public static void main(String[] args) {
		Marco mimarco = new Marco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
