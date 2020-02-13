package superClass_ejemplo2;

public class EquipoDeFútbol {
	protected String nombre, apellido, selección, labor;
	protected int edad;

	EquipoDeFútbol() {
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
		this.selección = "";
		this.labor = "";
	}

	EquipoDeFútbol(String nombre, String apellido, int edad, String selección, String labor) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.selección = selección;
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

	public String getSelección() {
		return selección;
	}

	public void setSelección(String selección) {
		this.selección = selección;
	}

	public String getLabor() {
		return labor;
	}

	public void setLabor(String labor) {
		this.labor = labor;
	}
}
