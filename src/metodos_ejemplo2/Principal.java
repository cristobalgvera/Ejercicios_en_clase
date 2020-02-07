package metodos_ejemplo2;

import java.util.*;

public class Principal {
	static Scanner scr = new Scanner(System.in);
	static List<Persona> people = new ArrayList<Persona>();

	public static void main(String[] args) {
		boolean intValidation = false;
		double numberOfPeople;
		do {
			System.out.print("Ingrese el número de personas a ingresar: ");
			numberOfPeople = scr.nextInt();
			scr.nextLine();
			intValidation = numericIntValidation(numberOfPeople, 1);
			if (intValidation == false)
				System.out.println("Número ingresado no es válido, reintente\n");
		} while (intValidation == false);
		String name;
		int age;
		for (int i = 0; i < (int) numberOfPeople; i++) {
			System.out.print("\nNombre: ");
			name = scr.nextLine();
			System.out.print("Edad: ");
			age = scr.nextInt();
			scr.nextLine();
			people.add(new Persona(name, age));
		}
		System.out.println("\n\nDETALLE:\n");
		for (int i = 0; i < people.size(); i++) {
			people.get(i).Advertising();
		}
	}

	public static boolean numericIntValidation(Double number, int minNumber) {
		boolean validation = false;
		if (number >= minNumber && number % 1 == 0) // Validación para saber que el número comple
													// las condiciones
			validation = true;
		return validation;
	}

}
