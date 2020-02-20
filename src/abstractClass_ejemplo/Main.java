package abstractClass_ejemplo;

import java.util.Scanner;

public class Main {
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		int resp = -1;
		do {
			System.out.print("Figura a ingresar\n\n(1) Cuadrado\n(2) Triángulo\n(3) Círculo\n\n-> ");
			resp = Integer.parseInt(scr.nextLine());
			switch (resp) {
			case 1:
				Figura cuadrado = new Cuadrado();
				System.out.print("\nColor: ");
				((Cuadrado) cuadrado).setColor(scr.nextLine());
				System.out.print("Lado = ");
				((Cuadrado) cuadrado).setLado(Double.parseDouble(scr.nextLine()));
				System.out.println(cuadrado.toString());
				break;
			case 2:
				Figura triángulo = new Triángulo();
				System.out.print("\nColor: ");
				((Triángulo) triángulo).setColor(scr.nextLine());
				System.out.print("Base = ");
				((Triángulo) triángulo).setBase(Double.parseDouble(scr.nextLine()));
				System.out.print("Altura = ");
				((Triángulo) triángulo).setAltura(Double.parseDouble(scr.nextLine()));
				System.out.println(triángulo.toString());
				break;
			case 3:
				Figura círculo = new Círculo();
				System.out.print("\nColor: ");
				((Círculo) círculo).setColor(scr.nextLine());
				System.out.print("Radio = ");
				((Círculo) círculo).setRadio(Double.parseDouble(scr.nextLine()));
				System.out.println(círculo.toString());
				break;
			}
		} while (resp != 0);
	}

}
