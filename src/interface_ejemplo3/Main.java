package interface_ejemplo3;

import java.util.Scanner;

public class Main {
	static String resp;
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		resp = "1";
		do {
			System.out.println(
					"OPCIONES A ELEGIR\n\n(1) Añadir persona\n(2) Eliminar persona\n(3) Primera persona\n(4) Comprobar vacío\n(5) Salir\n");
			resp = scr.nextLine();
			switch (resp) {
//			case "1":
//				System.out.print("Añadir por la derecha (1) o por la izquiera (-1): ");
//				Persona.persona.Añadir(Integer.parseInt(scr.nextLine()));
//				break;
//			case "2":
//				Extraer();
//				break;
//			case "3":
//				Primero().toString());
//				break;
//			case "4":
//				estaVacía();
//				break;
			}
		} while (!resp.equalsIgnoreCase("5"));
		System.out.println("SESIÓN FINALIZADA");
	}
}
