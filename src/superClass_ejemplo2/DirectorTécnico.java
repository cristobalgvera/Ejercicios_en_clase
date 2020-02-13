package superClass_ejemplo2;

public class DirectorT�cnico extends EquipoDeF�tbol {
	private String nacionalidad;

	public DirectorT�cnico() {
		super();
		this.setNacionalidad("");
		this.labor = "Director T�cnico";
	}

	public DirectorT�cnico(String nombre, String apellido, int edad, String selecci�n, String nacionalidad) {
		super(nombre, apellido, edad, selecci�n, "Director T�cnico");
		this.setNacionalidad(nacionalidad);
	}

	void dirigirEquipo() {
		// Acci�n de dar instrucciones
	}

	void planearPartido() {
		// Acci�n de decidir forma del equipo
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String toString() {
		String datos = this.labor + "\t" + this.nombre + "\t\t" + this.apellido + "\t\t" + this.edad + "\t\t"
				+ this.selecci�n + "\t\t" + this.nacionalidad;
		return datos;
	}

}
