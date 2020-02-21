package interface_ejemplo3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Persona implements ColecciónInterfaz {
	static Scanner scr = new Scanner(System.in);
	protected static List<Persona> persona = new ArrayList<Persona>();
	protected String nombre, edad;
//	private int aux = 0;

	public Persona() {

	}

	public Persona(String nombre, String edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < persona.size(); i++) {
			sb.append("Nombre: " + persona.get(i).getNombre());
			sb.append("Edad: " + persona.get(i).getEdad());
		}
		return sb.toString();
	}

	public String toString(int i) {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: " + persona.get(i).getNombre());
		sb.append("Edad: " + persona.get(i).getEdad());
		return sb.toString();
	}

	@Override
	public boolean estaVacía() {
		return persona.size() > 0;
	}

	@Override
	public void Extraer() {
		try {
			System.out.println(toString(0));
			persona.remove(0);
		} catch (Exception e) {
			System.out.println("No han sido encontradas personas");
		}

	}

	@Override
	public Object Primero() {
		try {
			return persona.get(0).toString();
		} catch (Exception e) {
			System.out.println("No han sido encontradas personas");
			return null;
		}
	}

	public boolean Añadir(int extremo) {
		if (extremo < 0) {
			persona.set(0, new Persona());
			System.out.print("Nombre: ");
			persona.get(0).setNombre(scr.nextLine());
			System.out.print("Edad: ");
			persona.get(0).setEdad(scr.nextLine());
			return true;
		} else if (extremo > 0) {
			persona.add(new Persona());
			System.out.print("Nombre: ");
			persona.get(persona.size() - 1).setNombre(scr.nextLine());
			System.out.print("Edad: ");
			persona.get(persona.size() - 1).setEdad(scr.nextLine());
			return true;
		} else {
			return false;
		}
	}

}
