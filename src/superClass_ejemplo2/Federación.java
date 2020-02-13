package superClass_ejemplo2;

import java.util.*;

public class Federaci�n {
	static List<EquipoDeF�tbol> equipos = new ArrayList<EquipoDeF�tbol>();
	static Scanner scr = new Scanner(System.in);
	static int aux = 0;

	public static void main(String[] args) {
		String resp = "";
		do {
			Men�();
			resp = scr.nextLine();
			switch (resp) {
			case "1":
				Jugador();
				aux++;
				break;
			case "2":
				directorT�cnico();
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
		System.out.println("\n***********SESI�N FINALIZADA***********");
	}

	static void Men�() {
		System.out.println("\nINSCRIPCI�N DE EQUIPOS\n");
		System.out.println("(1) Jugador\n(2) Director T�cnico\n(3) Masajista\n(4) Mostrar datos\n(0) Salir\n");
		System.out.println("Selecciona una opci�n para inscibir:");
	}

	static void mostrarInscritos() {
		System.out.println("\n***********************************************\n\nINSCRITOS SELECCI�N\n");
		for (int i = 0; i < equipos.size(); i++) {
			System.out.println(equipos.get(i).toString());
		}
		if (equipos.size() == 0)
			System.out.println("---- No existen inscritos ----");
		System.out.println("\n***********************************************");
	}

	static void equipoDeF�tbol() {
		System.out.print("\nNombre: ");
		((EquipoDeF�tbol) equipos.get(aux)).setNombre(scr.nextLine());
		System.out.print("Apellido: ");
		((EquipoDeF�tbol) equipos.get(aux)).setApellido(scr.nextLine());
		System.out.print("Edad: ");
		((EquipoDeF�tbol) equipos.get(aux)).setEdad(scr.nextInt());
		scr.nextLine();
		System.out.print("Selecci�n: ");
		((EquipoDeF�tbol) equipos.get(aux)).setSelecci�n(scr.nextLine());
	}

	static void Jugador() {
		equipos.add(new Jugador());
		equipoDeF�tbol();
		System.out.print("Dorsal: ");
		((Jugador) equipos.get(aux)).setDorsal(scr.nextInt());
		scr.nextLine();
		System.out.print("Posici�n: ");
		((Jugador) equipos.get(aux)).setPosici�n(scr.nextLine());
	}

	static void directorT�cnico() {
		equipos.add(new DirectorT�cnico());
		equipoDeF�tbol();
		System.out.print("Nacionalidad: ");
		((DirectorT�cnico) equipos.get(aux)).setNacionalidad(scr.nextLine());
	}

	static void Masajista() {
		equipos.add(new Masajista());
		equipoDeF�tbol();
		System.out.print("T�tulo: ");
		((Masajista) equipos.get(aux)).setT�tulo(scr.nextLine());
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
