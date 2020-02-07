package metodos_ejemplo;

public class Alumno {
	// Atributos
	int id;
	String name, lastName;

	// Método constructor
	Alumno(int id, String nombre, String apellido) {
		// Inicializamos los atributos
		this.id = id;
		this.name = nombre;
		this.lastName = apellido;
	}

	public void verDatos() {
		System.out.println("ID: " + id);
		System.out.println("Nombre: " + name);
		System.out.println("Apellido: " + lastName);
	}
}
