package guía_4_E1;

public class Persona {
	static String rut, name, lastName, adress;

	Persona() {

	}

	Persona(String rut, String name, String lastName, String adress) {
		Persona.rut = rut;
		Persona.lastName = lastName;
		Persona.name = name;
		Persona.adress = adress;
	}

	public static String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		Persona.rut = rut;
	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		Persona.name = name;
	}

	public static String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		Persona.lastName = lastName;
	}

	public static String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		Persona.adress = adress;
	}

	@Override
	public String toString() {
		System.out.println("\n*******************************\n");
		System.out.println("Nombre: " + name + "\nApellido: " + lastName + "\nRUT: " + rut + "\nDirección: " + adress);
		System.out.println("\n*******************************\n");
		return null;
	}

}
