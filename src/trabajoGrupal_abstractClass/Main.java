package trabajoGrupal_abstractClass;

import java.util.Scanner;

public class Main {
	static Scanner scr = new Scanner(System.in);

	static int d�a = 0;
	static String avance;

	public static void main(String[] args) {
		crearAnimales();
		do {
			nuevoD�a();
			System.out.println(Animal.cantidadAnimales());
			if (Animal.poblaci�n != 0) {
				System.out.println(
						"\n**************************************\nEnter vac�o -> Nuevo d�a\nEnter con caracteres -> Terminar ciclo\n**************************************");
				avance = scr.nextLine();
			} else {
				System.out.println(
						"\n********************************\nNO EXISTE VIDA EN EL ECOSISTEMA\n********************************");
				avance = " ";
			}
		} while (avance.equalsIgnoreCase(""));
	}

	static void crearAnimales() {
		int tipoAlimentaci�n;
		int cantidadAnimales = (int) (Math.random() * 100) + 50;
		for (int i = 0; i < cantidadAnimales; i++) {
			tipoAlimentaci�n = (int) (Math.random() * 3) - 1;
			if (tipoAlimentaci�n < 0) {
				Animal.animales.add(new Carn�voro());
				Animal.animales.get(i).crearOtro();
			} else if (tipoAlimentaci�n > 0) {
				Animal.animales.add(new Herb�voro());
				Animal.animales.get(i).crearOtro();
			} else {
				Animal.animales.add(new Omn�voro());
				Animal.animales.get(i).crearOtro();
			}
			Animal.animales.remove(i);
		}
	}

	static void nuevoD�a() {
		System.out.println("D�A " + (d�a + 1) + "\n");
		if (d�a > 0) {
			for (int i = 0; i < Animal.animales.size(); i++) {
				Animal.animales.get(i).Alimentar();
				if (!Animal.animales.get(i).isAlimentaci�n())
					Animal.animales.remove(i);
			}
			for (int i = 0; i < Animal.animales.size(); i++) {
				Animal.animales.get(i).Reproducir();
				if (Animal.animales.get(i).isReproducci�n())
					Animal.animales.get(i).crearOtro();
			}
		}
		d�a++;
	}
}
