package interface_ejemplo3;

import java.util.Scanner;

public class Main {
	static String resp;
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		resp = "1";
		do {
			System.out.println(
					"OPCIONES A ELEGIR\n\n(1) A�adir persona\n(2) Eliminar persona\n(3) Primera persona\n(4) Comprobar vac�o\n(5) Salir\n");
			resp = scr.nextLine();
			switch (resp) {
//			case "1":
//				System.out.print("A�adir por la derecha (1) o por la izquiera (-1): ");
//				Persona.persona.A�adir(Integer.parseInt(scr.nextLine()));
//				break;
//			case "2":
//				Extraer();
//				break;
//			case "3":
//				Primero().toString());
//				break;
//			case "4":
//				estaVac�a();
//				break;
			}
		} while (!resp.equalsIgnoreCase("5"));
		System.out.println("SESI�N FINALIZADA");
	}
}
