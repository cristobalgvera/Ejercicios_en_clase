package metodos_ejemplo;

import java.util.Scanner;

public class Principal {
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		int id;
		String name, lastName;
		Alumno[] alum = new Alumno[1];
		for (int i = 0; i < alum.length; i++) {
			System.out.print("Nombre: ");
			name = scr.nextLine();
			System.out.print("Apellido: ");
			lastName = scr.nextLine();
			System.out.print("ID: ");
			id = scr.nextInt();
			scr.nextLine();
			System.out.println();
			alum[i] = new Alumno(id, name, lastName);
		}
		for (int i = 0; i < alum.length; i++) {
			alum[i].verDatos();
			System.out.println();
		}
	}

}
