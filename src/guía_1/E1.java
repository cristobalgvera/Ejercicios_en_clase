package guía_1;

import java.util.Scanner;

public class E1 {
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		double num = 0;
		int num_len = 0;
		String num_str;
		System.out.println("Ingrese un número entre 0 - 9999");
		num_str = scr.nextLine();
		num = Integer.parseInt(num_str);
		while ((num < 0) || (num / ((int) num) != 1) || num > 9999) {
			System.out.println("\nNúmero ingresado es incorrecto, reintente");
			num_str = scr.nextLine();
			num = Integer.parseInt(num_str);
		}
		num_len = num_str.length();
		System.out.println("\n\nEl número " + (int) num + " tiene " + num_len + " cifras");
	}

}
