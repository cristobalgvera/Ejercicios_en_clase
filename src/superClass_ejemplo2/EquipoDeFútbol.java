package superClass_ejemplo2;

public class EquipoDeF�tbol {
	protected String nombre, apellido, selecci�n, labor;
	protected int edad;

	EquipoDeF�tbol() {
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
		this.selecci�n = "";
		this.labor = "";
	}

	EquipoDeF�tbol(String nombre, String apellido, int edad, String selecci�n, String labor) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.selecci�n = selecci�n;
		this.labor = labor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSelecci�n() {
		return selecci�n;
	}

	public void setSelecci�n(String selecci�n) {
		this.selecci�n = selecci�n;
	}

	public String getLabor() {
		return labor;
	}

	public void setLabor(String labor) {
		this.labor = labor;
	}
}
