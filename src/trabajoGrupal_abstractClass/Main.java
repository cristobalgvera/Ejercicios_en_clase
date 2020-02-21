package trabajoGrupal_abstractClass;

import java.util.Scanner;

public class Main {
	static Scanner scr = new Scanner(System.in);

	static int día = 0;
	static String avance;

	public static void main(String[] args) {
		crearAnimales();
		do {
			nuevoDía();
			System.out.println(Animal.cantidadAnimales());
			if (Animal.población != 0) {
				System.out.println(
						"\n**************************************\nEnter vacío -> Nuevo día\nEnter con caracteres -> Terminar ciclo\n**************************************");
				avance = scr.nextLine();
			} else {
				System.out.println(
						"\n********************************\nNO EXISTE VIDA EN EL ECOSISTEMA\n********************************");
				avance = " ";
			}
		} while (avance.equalsIgnoreCase(""));
	}

	static void crearAnimales() {
		int tipoAlimentación;
		int cantidadAnimales = (int) (Math.random() * 100) + 50;
		for (int i = 0; i < cantidadAnimales; i++) {
			tipoAlimentación = (int) (Math.random() * 3) - 1;
			if (tipoAlimentación < 0) {
				Animal.animales.add(new Carnívoro());
				Animal.animales.get(i).crearOtro();
			} else if (tipoAlimentación > 0) {
				Animal.animales.add(new Herbívoro());
				Animal.animales.get(i).crearOtro();
			} else {
				Animal.animales.add(new Omnívoro());
				Animal.animales.get(i).crearOtro();
			}
			Animal.animales.remove(i);
		}
	}

	static void nuevoDía() {
		System.out.println("DÍA " + (día + 1) + "\n");
		if (día > 0) {
			for (int i = 0; i < Animal.animales.size(); i++) {
				Animal.animales.get(i).Alimentar();
				if (!Animal.animales.get(i).isAlimentación())
					Animal.animales.remove(i);
			}
			for (int i = 0; i < Animal.animales.size(); i++) {
				Animal.animales.get(i).Reproducir();
				if (Animal.animales.get(i).isReproducción())
					Animal.animales.get(i).crearOtro();
			}
		}
		día++;
	}
}
