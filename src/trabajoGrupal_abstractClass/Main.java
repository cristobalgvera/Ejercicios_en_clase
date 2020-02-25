package trabajoGrupal_abstractClass;

import java.util.Scanner;

public class Main {
	static Scanner scr = new Scanner(System.in);

	static int día = 0;
	static String avance;

	public static void main(String[] args) {
		menúPrincipal();
		int opción = menúOpciones();
		switch (opción) {
		case 1:
			System.out.print("Días para la supervivencia: ");
			Extinción(Integer.parseInt(scr.nextLine()));
			break;
		case 2:
			seleccionarExtinción();
			break;
		case 3:
			System.out.print("Digite el día a conocer: ");
			conocerDíaEspecífico(Integer.parseInt(scr.nextLine()));
			System.out.print("Enter para conocer la extinción");
			scr.nextLine();
			System.out.print("Días para la supervivencia: ");
			Extinción(Integer.parseInt(scr.nextLine()));
			break;
		case 4:
			interacciónAnimales();
			break;
		}
		System.out.println("\n\n***************************");
		System.out.println("**   SESIÓN FINALIZADA   **");
		System.out.print("***************************");
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

	static void seleccionarExtinción() {
		int opción = 1;
		do {
			if (opción > 3 || opción < 1)
				System.out.println("Valor ingresado no es válido, reintente\n");
			System.out.print("ESPECIES POSIBLES\n\n(1) Carnívoros\n(2) Omnívoros\n(3) Herbívoros\n\nSeleccione la especie a evaluar\n-> ");
			opción = Integer.parseInt(scr.nextLine());
		} while (opción > 3 || opción < 1);
		extinciónEspecie(opción);
	}

	static void conocerDíaEspecífico(int... días) {
		for (int díaSolicitado : días) {
			do {
				nuevoDía();
				Animal.cantidadAnimales();
				if (díaSolicitado == día)
					break;
			} while (Animal.población != 0);
			System.out.print("\nDía " + día + ":");
			if (Animal.población != 0) {
				System.out.println("\n\n" + Animal.cantidadAnimales() + "\n");
			} else {
				System.out.println(" La solicitud no puede ser procesada");
				System.out.println(
						"\n********************************\nNO EXISTE VIDA EN EL ECOSISTEMA\n********************************");
			}
		}
	}

	static void extinciónEspecie(int especie) {
		System.out.println("\n" + Animal.cantidadAnimales() + "\n");
		boolean especieVive = true;
		do {
			nuevoDía();
			Animal.cantidadAnimales();
			switch (especie) {
			case 1:
				especieVive = Animal.carnívoros != 0;
				break;
			case 2:
				especieVive = Animal.omnívoros != 0;
				break;
			case 3:
				especieVive = Animal.herbívoros != 0;
				break;
			}
		} while (Animal.población != 0 && especieVive);
		if (Animal.población == 0) {
			System.out.println("¡NADIE SOBREVIVIÓ!\n\n" + Animal.cantidadAnimales());
		} else {
			System.out.println("¡ESPECIE EXTINTA!\n\n" + Animal.cantidadAnimales());
		}
		System.out.print("\nCantidad de días: " + (día));
	}

	static void Extinción(int díasSupervivencia) {
		System.out.println("\n" + Animal.cantidadAnimales() + "\n");
		do {
			nuevoDía();
			Animal.cantidadAnimales();
		} while (Animal.población != 0 && día < díasSupervivencia);
		System.out.println("Cantidad de días: " + (día) + "\n");
		if (día == díasSupervivencia)
			System.out.println("¡SUPERVIVENCIA!\n\n" + Animal.cantidadAnimales());
	}

	static void interacciónAnimales() {
		do {
			nuevoDía();
			System.out.println("DÍA " + (día + 1) + "\n");
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
		builder.append("(4) Mostrar normalmente\n");
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
				opción = verificarInt(Integer.parseInt(scr.nextLine()), 1, 2, 3, 4);
				if (opción < 0)
					opciónBoolean = false;
			} catch (Exception e) {
				opciónBoolean = false;
			}
		} while (!opciónBoolean);
		System.out.println();
		return opción;
	}

	static int verificarInt(int a, int b, int c, int d, int e) {
		boolean verificador = a == b || a == c || a == d || a == e;
		if (verificador) {
			return a;
		} else {
			return -1;
		}
	}

	static void nuevoDía() {
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
