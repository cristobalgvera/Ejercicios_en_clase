package superClass_ejemplo2;

import java.util.*;

public class Federación {
	static List<EquipoDeFútbol> equipos = new ArrayList<EquipoDeFútbol>();
	static Scanner scr = new Scanner(System.in);
	static int aux = 0;

	public static void main(String[] args) {
		String resp = "";
		do {
			Menú();
			resp = scr.nextLine();
			switch (resp) {
			case "1":
				Jugador();
				aux++;
				break;
			case "2":
				directorTécnico();
				aux++;
				break;
			case "3":
				Masajista();
				aux++;
				break;
			case "4":
				mostrarInscritos();
				break;
			default:
				resp = "0";
				break;
			}
		} while (!validador(resp, "0"));
		mostrarInscritos();
		System.out.println("\n***********SESIÓN FINALIZADA***********");
	}

	static void Menú() {
		System.out.println("\nINSCRIPCIÓN DE EQUIPOS\n");
		System.out.println("(1) Jugador\n(2) Director Técnico\n(3) Masajista\n(4) Mostrar datos\n(0) Salir\n");
		System.out.println("Selecciona una opción para inscibir:");
	}

	static void mostrarInscritos() {
		System.out.println("\n***********************************************\n\nINSCRITOS SELECCIÓN\n");
		for (int i = 0; i < equipos.size(); i++) {
			System.out.println(equipos.get(i).toString());
		}
		if (equipos.size() == 0)
			System.out.println("---- No existen inscritos ----");
		System.out.println("\n***********************************************");
	}

	static void equipoDeFútbol() {
		System.out.print("\nNombre: ");
		((EquipoDeFútbol) equipos.get(aux)).setNombre(scr.nextLine());
		System.out.print("Apellido: ");
		((EquipoDeFútbol) equipos.get(aux)).setApellido(scr.nextLine());
		System.out.print("Edad: ");
		((EquipoDeFútbol) equipos.get(aux)).setEdad(scr.nextInt());
		scr.nextLine();
		System.out.print("Selección: ");
		((EquipoDeFútbol) equipos.get(aux)).setSelección(scr.nextLine());
	}

	static void Jugador() {
		equipos.add(new Jugador());
		equipoDeFútbol();
		System.out.print("Dorsal: ");
		((Jugador) equipos.get(aux)).setDorsal(scr.nextInt());
		scr.nextLine();
		System.out.print("Posición: ");
		((Jugador) equipos.get(aux)).setPosición(scr.nextLine());
	}

	static void directorTécnico() {
		equipos.add(new DirectorTécnico());
		equipoDeFútbol();
		System.out.print("Nacionalidad: ");
		((DirectorTécnico) equipos.get(aux)).setNacionalidad(scr.nextLine());
	}

	static void Masajista() {
		equipos.add(new Masajista());
		equipoDeFútbol();
		System.out.print("Título: ");
		((Masajista) equipos.get(aux)).setTítulo(scr.nextLine());
		System.out.print("Experiencia: ");
		((Masajista) equipos.get(aux)).setExperiencia(scr.nextInt());
		scr.nextLine();
	}

	static boolean validador(String resp, String a) {
		boolean respBoolean = false;
		if (resp.equalsIgnoreCase(a))
			respBoolean = true;
		return respBoolean;
	}

}
