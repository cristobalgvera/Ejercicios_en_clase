package guía_2;

import java.util.Random;
//import java.util.Scanner;

public class E1 {
//	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		int num, aux = 0, suma = 0;
		Random rand = new Random();
		while (aux < 15) {
			num = 1 + rand.nextInt(10);
			suma += num;
			System.out.println((aux + 1) + ": " + num);
			aux++;
		}
		System.out.print("\nSuma de los dígitos: " + suma);
	}

}
