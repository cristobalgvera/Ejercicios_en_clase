package trabajoGrupal_abstractClass;

import java.util.Scanner;

public class Main {
	static Scanner scr = new Scanner(System.in);

	static int d�a = 0;
	static String avance;

	public static void main(String[] args) {
		men�Principal();
		int opci�n = men�Opciones();
		switch (opci�n) {
		case 1:
			Extinci�n();
			break;
		case 4:
			interacci�nAnimales();
			break;
		}
	}

	static void crearAnimales(double cantidad) {
		int tipoAlimentaci�n;
//		int cantidadAnimales = (int) (Math.random() * 100) + 50;
		int cantidadAnimales = (int) cantidad;
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

	static void Extinci�n() {
		int supervivencia = 300;
		System.out.println(Animal.cantidadAnimales() + "\n");
		do {
			nuevoD�a();
			Animal.cantidadAnimales();
		} while (Animal.poblaci�n != 0 && d�a < supervivencia);
		System.out.println("Cantidad de d�as: " + (d�a) + "\n");
		if (d�a == supervivencia)
			System.out.println("�SUPERVIVENCIA!\n\n" + Animal.cantidadAnimales());
	}

	static void interacci�nAnimales() {
		do {
			nuevoD�a();
			System.out.println("D�A " + (d�a + 1) + "\n");
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

	static void men�Principal() {
		double cantidad = 0;
		boolean cantidadBoolean = true;
		System.out.println("EL LIBRO DE LA SELVA\n");
		do {
			if (!cantidadBoolean)
				System.out.println("N�mero ingresado no es v�lido, reintente\n");
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

	static int men�Opciones() {
		StringBuilder builder = new StringBuilder();
		builder.append("(1) Conocer d�a de extinci�n\n");
		builder.append("(2) Seleccionar extinci�n\n");
		builder.append("(3) Seleccionar d�a\n");
		builder.append("(4) Mostrar normalmente\n");
		builder.append("\nSeleccione una opci�n para evaluar\n-> ");
		System.out.print(builder.toString());
		boolean opci�nBoolean = true;
		int opci�n = 0;
		do {
			if (!opci�nBoolean) {
				System.out.println("N�mero ingresado no es v�lido, reintente\n");
				System.out.print("Opci�n a evaluar: ");
			}
			try {
				opci�nBoolean = true;
				opci�n = verificarInt(Integer.parseInt(scr.nextLine()), 1, 2, 3, 4);
				if (opci�n < 0)
					opci�nBoolean = false;
			} catch (Exception e) {
				opci�nBoolean = false;
			}
		} while (!opci�nBoolean);
		System.out.println();
		return opci�n;
	}

	static int verificarInt(int a, int b, int c, int d, int e) {
		boolean verificador = a == b || a == c || a == d || a == e;
		if (verificador) {
			return a;
		} else {
			return -1;
		}
	}

	static void nuevoD�a() {
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
