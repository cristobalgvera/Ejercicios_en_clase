package abstractClass_ejemplo;

import java.util.Scanner;

public class Main {
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		int resp = -1;
		do {
			System.out.print("Figura a ingresar\n\n(1) Cuadrado\n(2) Tri�ngulo\n(3) C�rculo\n\n-> ");
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
				Figura tri�ngulo = new Tri�ngulo();
				System.out.print("\nColor: ");
				((Tri�ngulo) tri�ngulo).setColor(scr.nextLine());
				System.out.print("Base = ");
				((Tri�ngulo) tri�ngulo).setBase(Double.parseDouble(scr.nextLine()));
				System.out.print("Altura = ");
				((Tri�ngulo) tri�ngulo).setAltura(Double.parseDouble(scr.nextLine()));
				System.out.println(tri�ngulo.toString());
				break;
			case 3:
				Figura c�rculo = new C�rculo();
				System.out.print("\nColor: ");
				((C�rculo) c�rculo).setColor(scr.nextLine());
				System.out.print("Radio = ");
				((C�rculo) c�rculo).setRadio(Double.parseDouble(scr.nextLine()));
				System.out.println(c�rculo.toString());
				break;
			}
		} while (resp != 0);
	}

}
