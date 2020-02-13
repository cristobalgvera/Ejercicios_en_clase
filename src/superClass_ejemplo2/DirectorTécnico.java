package superClass_ejemplo2;

public class DirectorTécnico extends EquipoDeFútbol {
	private String nacionalidad;

	public DirectorTécnico() {
		super();
		this.setNacionalidad("");
		this.labor = "Director Técnico";
	}

	public DirectorTécnico(String nombre, String apellido, int edad, String selección, String nacionalidad) {
		super(nombre, apellido, edad, selección, "Director Técnico");
		this.setNacionalidad(nacionalidad);
	}

	void dirigirEquipo() {
		// Acción de dar instrucciones
	}

	void planearPartido() {
		// Acción de decidir forma del equipo
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String toString() {
		String datos = this.labor + "\t" + this.nombre + "\t\t" + this.apellido + "\t\t" + this.edad + "\t\t"
				+ this.selección + "\t\t" + this.nacionalidad;
		return datos;
	}

}
