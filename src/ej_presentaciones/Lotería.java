package ej_presentaciones;

import java.util.Scanner;

public class Loter�a {
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		int aux = 0, num_usuario = 0;
		int num_azar = (int) (Math.random() * 99);
//		System.out.println(num_azar);
		System.out.println("Ingrese un n�mero entre 0 y 99, si acierta el n�mero aleat�rio ganar�\n");
		do {
			aux++;
			num_usuario = (int) scr.nextDouble();
			if (num_usuario != num_azar)
				System.out.println("N�mero incorrecto, reintente\n");
		} while (num_azar != num_usuario);
		System.out.println("\n�Has acertado, GANASTE!\n");
		System.out.println("N�mero de intentos: " + aux);
	}

}
