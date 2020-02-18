package interface_ejemplo2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	static Scanner scr = new Scanner(System.in);
	static List<Persona> personas = new ArrayList<Persona>();

	public static void main(String[] args) {
		Saludo();
		System.out.println(personas.get(personas.size()-1));
		Mover();
	}
	
	static void Mover() {
		System.out.println("¿Quieres moverte? (S/N)");
		if (Verificador(scr.nextLine(), "s")) {
			System.out.println("\nPosición actual: " + personas.get(personas.size()-1).getMovimiento());
			System.out.print("Posiciones por mover: ");
			personas.get(personas.size()-1).Mover(Integer.parseInt(scr.nextLine()));
			System.out.print("Nueva posición: " + personas.get(personas.size()-1).getMovimiento());
		}
	}
	
	static boolean Verificador(String a, String b) {
		if (a.equalsIgnoreCase(b)) {
			return true;
		} else {
			return false;
		}
	}
	
	static void Saludo() {
		personas.add(new Persona());
		System.out.println("Hola, ¿cuál es tu nombre?");
		personas.get(personas.size()-1).setNombre(scr.nextLine());
		System.out.print("\nPosición inicial: ");
		personas.get(personas.size()-1).setMovimiento(Integer.parseInt(scr.nextLine()));
	}	
	
}
