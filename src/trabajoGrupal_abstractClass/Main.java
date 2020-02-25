package trabajoGrupal_abstractClass;

import java.util.Scanner;

public class Main {
	static Scanner scr = new Scanner(System.in);

	static int día = 0;
	static String avance;

	public static void main(String[] args) {
		menúPrincipal();
		menúOpciones();
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

	static void crearAnimales(double cantidad) {
		int tipoAlimentación;
//		int cantidadAnimales = (int) (Math.random() * 100) + 50;
		int cantidadAnimales = (int) cantidad;
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

	static void menúPrincipal() {
		double cantidad = 0;
		boolean cantidadBoolean = true;
		System.out.println("EL LIBRO DE LA SELVA\n");
		do {
			if (!cantidadBoolean)
				System.out.println("Número ingresado no es válido, reintente\n");
			System.out.print("Cantidad de animales: ");
			try {
				cantidadBoolean = true;
				cantidad = Double.parseDouble(scr.nextLine());
			} catch (Exception e) {
				cantidadBoolean = false;
			}
		} while (!cantidadBoolean);
		System.out.println("\n**************************************");
		crearAnimales(cantidad);
	}

	static int menúOpciones() {
		StringBuilder builder = new StringBuilder();
		builder.append("(1) Conocer día de extinción\n");
		builder.append("(2) Seleccionar extinción\n");
		builder.append("(3) Seleccionar día\n");
		builder.append("\nSeleccione una opción para evaluar\n-> ");
		System.out.print(builder.toString());
		boolean opciónBoolean = true;
		int opción = 0;
		do {
			if (!opciónBoolean) {
				System.out.println("Número ingresado no es válido, reintente\n");
				System.out.print("Opción a evaluar: ");
			}
			try {
				opciónBoolean = true;
				opción = verificarInt(Double.parseDouble(scr.nextLine()), 1, 2, 3);
				if (opción < 0)
					opciónBoolean = false;
			} catch (Exception e) {
				opciónBoolean = false;
				break;
			}
		} while (!opciónBoolean);
		return opción;
	}
	
	static int verificarInt(double a, int b, int c, int d) {
		boolean verificador = a == b || a == c || a==d;
		if (verificador) {
			return (int) a;
		} else {
			return -1;
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
