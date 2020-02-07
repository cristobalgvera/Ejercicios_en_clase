package gu�a_1;

import java.util.Scanner;

public class E_PPT {
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		int i, aux = 0;
		System.out.println("Ingrese la palabra a tomar en consideraci�n:");
		String palabra = scr.nextLine();
		int lon = palabra.length();

		System.out.println("\nDATOS RELEVANTES:\n");

		for (i = 0; i < lon; i++) {
			if (i % 10 == 9 || i == 0) {
				System.out.print(aux);
				aux += 1;
			} else if (i % 5 == 4) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		}
		System.out.println("");
		for (i = 1; i < lon + 1; i++) {
			System.out.print(i % 10);
		}
		System.out.println("");
		for (i = 0; i < lon; i++) {
			System.out.print(palabra.charAt(i));
		}
		System.out.println("\n\nTama�o total: " + lon + " caracteres");

		int lon_media = lon / 2 - 1;
		char palabra_1 = palabra.charAt(lon_media);
		System.out.println("Caracter de la posici�n " + (lon_media + 1) + ": '" + palabra_1 + "'");

		lon_media += lon / 4;
		String palabra_2 = palabra.substring(lon_media);
		System.out.println("Cadena desde la posici�n " + (lon_media + 1) + ": '" + palabra_2 + "'");

		String palabra_3 = palabra.substring(lon / 4, lon_media);
		System.out.println("Parte de la cadena total: '" + palabra_3 + "'");

		int pos_a = (palabra.toLowerCase()).indexOf('a');
		if (pos_a == -1) {
			System.out.println("Posici�n de la primera aparici�n de la letra A: NOT FOUND");
		} else {
			System.out.println("Posici�n de la primera aparici�n de la letra A: " + (pos_a + 1));
		}

		int pos_a2 = (palabra.toLowerCase()).indexOf('a', pos_a + 1);
		if (pos_a2 == -1) {
			System.out.println("Posici�n de letra A desde la primera aparici�n: NOT FOUND");
		} else {
			System.out.println("Posici�n de letra A relativo a la primera aparici�n: " + (pos_a2 - pos_a) + " ("
					+ (pos_a2 + 1) + ")");
		}

		String palabra_4;
		if (lon > 6) {
			palabra_4 = palabra.substring(0, 7);
		} else {
			palabra_4 = palabra;
		}
		int igual = palabra_4.compareTo("Talento");
		boolean resp = false;
		if (igual == 0)
			resp = true;
		System.out.println("Comprobando igualdad con 'Talento': " + resp);

		igual = palabra_4.compareTo("talento");
		resp = false;
		if (igual == 0)
			resp = true;
		System.out.println("Comprobando igualdad con 'talento': " + resp);

		igual = palabra_4.compareTo("TALENTO");
		resp = false;
		if (igual == 0)
			resp = true;
		System.out.println("Comprobando igualdad con TALENTO: " + resp);

		System.out.println("Cambiar los caracteres a min�sculas: " + palabra.toLowerCase());

		System.out.println("Cambiar los caracteres a may�sculas: " + palabra.toUpperCase());

		System.out.println("Reemplazamos las 'Y' por 'G': " + (palabra.replace('Y', 'y')).replace('y', 'G'));
	}

}
