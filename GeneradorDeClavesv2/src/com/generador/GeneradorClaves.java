package com.generador;

import java.util.Random;

public class GeneradorClaves {

	public String GenerarClave() {
		String numeros[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		String[] mayus = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };

		String[] minus = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };

		String[] global = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
				"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
				"9" };

		String[] clave = new String[8];
//		char[] clave = new char[8];
		String resultado = new String();

		int tamaño_numeros = numeros.length;
		int tamaño_mayus = mayus.length;
		int tamaño_minus = minus.length;

		Random rand = new Random();
		int pos_alea_num = rand.nextInt(tamaño_numeros - 1);
		int pos_alea_mayus = rand.nextInt(tamaño_mayus - 1);
		int pos_alea_minus = rand.nextInt(tamaño_minus - 1);

		// System.out.println("la posicion del vector numeros es: " + pos_alea_num);
		String valor_num = numeros[pos_alea_num];
		// System.out.println("el valor de la posicion " + pos_alea_num + " en el vector
		// numeros es: " + valor_num);
		// System.out.println("");

		// System.out.println("la posicion del vector mayus es: " + pos_alea_mayus);
		String valor_mayus = mayus[pos_alea_mayus];
		// System.out.println("El valor de la posicion " + pos_alea_mayus + " en el
		// vecto mayus es: " + valor_mayus);
		// System.out.println("");

		// System.out.println("la posicion del vector minus es: " + pos_alea_minus);
		String valor_minus = minus[pos_alea_minus];
		// System.out.println("El valor de la posicion " + pos_alea_minus + " en el
		// vector minus es: " + valor_minus);
		// System.out.println("");

		clave[0] = valor_num;
		clave[1] = valor_mayus;
		clave[2] = valor_minus;

		int tamaño_global = global.length;
		int pos_alea_global_3 = rand.nextInt(tamaño_global - 1);
		int pos_alea_global_4 = rand.nextInt(tamaño_global - 1);
		int pos_alea_global_5 = rand.nextInt(tamaño_global - 1);
		int pos_alea_global_6 = rand.nextInt(tamaño_global - 1);
		int pos_alea_global_7 = rand.nextInt(tamaño_global - 1);

		// System.out.println("la posicion del vector global_3 es: " +
		// pos_alea_global_3);
		String valor_global_3 = global[pos_alea_global_3];
		// System.out.println("el valor de la posicion " + pos_alea_global_3 + " en el
		// vector global_3 es: " + valor_global_3);
		// System.out.println("");

		// System.out.println("la posicion del vector global_4 es: " +
		// pos_alea_global_4);
		String valor_global_4 = global[pos_alea_global_4];
		// System.out.println("el valor de la posicion " + pos_alea_global_4 + " en el
		// vector global_4 es: " + valor_global_4);
		// System.out.println("");

		// System.out.println("la posicion del vector global_5 es: " +
		// pos_alea_global_3);
		String valor_global_5 = global[pos_alea_global_5];
		// System.out.println("el valor de la posicion " + pos_alea_global_5 + " en el
		// vector global_5 es: " + valor_global_5);
		// System.out.println("");

		// System.out.println("la posicion del vector global_6 es: " +
		// pos_alea_global_3);
		String valor_global_6 = global[pos_alea_global_6];
		// System.out.println("el valor de la posicion " + pos_alea_global_6 + " en el
		// vector global_6 es: " + valor_global_6);
		// System.out.println("");

		// System.out.println("la posicion del vector global_7 es: " +
		// pos_alea_global_3);
		String valor_global_7 = global[pos_alea_global_7];
		// System.out.println("el valor de la posicion " + pos_alea_global_7 + " en el
		// vector global_7 es: " + valor_global_7);
		// System.out.println("");

		clave[3] = valor_global_3;
		clave[4] = valor_global_4;
		clave[5] = valor_global_5;
		clave[6] = valor_global_6;
		clave[7] = valor_global_7;

//		System.out.print("Su clave autogenerada es: ");
		
		for (int m = 0; m < clave.length; m++) {
//			System.out.print(clave[m]); 
			resultado = resultado.concat(clave[m]);
		}
//		System.out.println(resultado);
//		System.out.println("");
		
		return resultado;
	}
}
