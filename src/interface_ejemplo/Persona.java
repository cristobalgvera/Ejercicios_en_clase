package interface_ejemplo;

public class Persona implements Canto, Baile {

	private String nombre;

	Persona() {

	}

	public void Cantar() {
		System.out.println("Laralaaaa, laralaaa");
	}

	public void Bailar() {
		System.out.print("El baile del perrito (8)");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
