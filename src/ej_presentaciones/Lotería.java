package ej_presentaciones;

import java.util.Scanner;

public class Lotería {
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		int aux = 0, num_usuario = 0;
		int num_azar = (int) (Math.random() * 99);
//		System.out.println(num_azar);
		System.out.println("Ingrese un número entre 0 y 99, si acierta el número aleatório ganará\n");
		do {
			aux++;
			num_usuario = (int) scr.nextDouble();
			if (num_usuario != num_azar)
				System.out.println("Número incorrecto, reintente\n");
		} while (num_azar != num_usuario);
		System.out.println("\n¡Has acertado, GANASTE!\n");
		System.out.println("Número de intentos: " + aux);
	}

}
