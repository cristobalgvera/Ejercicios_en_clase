package superClass_llamadaTelefónica;

import java.util.Scanner;

public class Main {
	static Scanner scr = new Scanner(System.in);
	static Celular celular = new Celular();
	static String resp;

	public static void main(String[] args) {
		baseContactos();
		menúPrincipal();
	}

	static void menúPrincipal() {
		boolean respBoolean = true;
		do {
			resp = "1";
			do {
				if (!Verificador(resp, "1") && !Verificador(resp, "2") && !Verificador(resp, "3")
						&& !Verificador(resp, "4") && !Verificador(resp, "5") && !Verificador(resp, "6"))
					System.out.println("\n****Has ingresado una opción incorrecta, reintente:****\n");
				resp = Opciones();
			} while (!Verificador(resp, "1") && !Verificador(resp, "2") && !Verificador(resp, "3")
					&& !Verificador(resp, "4") && !Verificador(resp, "5") && !Verificador(resp, "6"));
			System.out.println();
			switch (resp) {
			case "1":
				mostrarContactos();
				presionaParaContinuar();
				break;
			case "2":
				eliminarContacto();
				break;
			case "3":
				agregarContacto();
				break;
			case "4":
				realizarLlamada();
				break;
			case "5":
				buscarNúmero();
				break;
			}
			if (resp.equalsIgnoreCase("6")) {
				System.out.println("*************************");
				System.out.println("**  SESIÓN FINALIZADA  **");
				System.out.print("*************************");
				respBoolean = false;
			} else {
				System.out.println();
			}
		} while (respBoolean == true);
	}

	static void realizarLlamada() {
		celular.realizarLlamada((int) (Math.random() * 5 + 1));
		System.out.println(celular.registroLlamadas() + "\n");
		presionaParaContinuar();
	}

	static void buscarNúmero() {
		System.out.print("Contacto a buscar: ");
		System.out.println(celular.buscarNúmero(scr.nextLine()) + "\n");
		presionaParaContinuar();
	}

	static void mostrarContactos() {
		System.out.println("**************************************");
		System.out.println("NOMBRE\t\t\tNÚMERO");
		System.out.println("**************************************");
		for (int i = 0; i < Teléfono.contactos.size(); i++) {
			System.out.println(Teléfono.contactos.get(i));
		}
		System.out.println("**************************************\n");
	}

	static public void presionaParaContinuar() {
		System.out.print("Presiona Enter para continuar");
		try {
			scr.nextLine();
		} catch (Exception e) {
		}
	}

	static void eliminarContacto() {
		mostrarParaEliminar();
		System.out.print("Seleccione el ID a eliminar:\n-> ");
		boolean idBoolean = true;
		do {
			int id = Integer.parseInt(scr.nextLine());
			if (id > 0 && id <= Teléfono.contactos.size()) {
				Teléfono.contactos.remove(id - 1);
				idBoolean = false;
			} else if (id != 0) {
				System.out.println("ID ingresado es incorrecto, reintente");
			} else {
				idBoolean = false;
			}
		} while (idBoolean == true);
	}

	static void mostrarParaEliminar() {
		System.out.println("**********************");
		System.out.println("ID\tNOMBRE");
		System.out.println("**********************");
		for (int i = 0; i < Teléfono.contactos.size(); i++) {
			System.out.println("(" + (i + 1) + ")\t" + Teléfono.contactos.get(i).getNombre());
		}
		System.out.println("**********************\n(0) CANCELAR\n");
	}

	static String Opciones() {
		System.out.println("**********************");
		System.out.println("CONTACTOS TELEFÓNICOS");
		System.out.println("**********************\n");
		System.out.println(
				"(1) Ver contactos\n(2) Eliminar contacto\n(3) Agregar contacto\n(4) Realizar llamada\n(5) Buscar contacto\n(6) Salir\n");
		System.out.println("**********************\n");
		System.out.print("Selecciones una opción\n-> ");
		return scr.nextLine();
	}

	static boolean Verificador(String a, String b) {
		if (a.equalsIgnoreCase(b)) {
			return true;
		} else {
			return false;
		}
	}

	static void agregarContacto() {
		System.out.print("Nombre: ");
		Teléfono.agregarContacto(scr.nextLine());
		System.out.print("Prefijo: ");
		Teléfono.contactos.get(Teléfono.contactos.size() - 1).setPrefijo(Math.abs(Integer.parseInt(scr.nextLine())));
		System.out.print("Número: ");
		Teléfono.contactos.get(Teléfono.contactos.size() - 1).setNúmero(Math.abs(Long.parseLong(scr.nextLine())));
	}

	static void baseContactos() {
		int prefijo;
		long número;
		String nombre;
		for (int i = 0; i < 10; i++) {
			prefijo = (int) (Math.random() * 899 + 100);
			número = (long) (Math.random() * 69999999 + 30000000);
			nombre = (i + 1) + "";
			Teléfono.agregarContacto(prefijo, número, nombre);
		}
	}

}
