package guía_4_E1;

import java.util.*;

public class Principal {
	static Scanner scr = new Scanner(System.in);
	static String rut, name, lastName, adress;
	static Persona person = new Persona();

	public static void main(String[] args) {
		System.out.print("Ingrese su nombre: ");
		person.setName(scr.nextLine());
		System.out.print("Ingrese su apellido: ");
		person.setLastName(scr.nextLine());
		System.out.print("Ingrese su RUT: ");
		person.setRut(scr.nextLine());
		System.out.print("Ingrese su domicilio: ");
		person.setAdress(scr.nextLine());
		person.toString();
	}

}
