package superClass_ejemplo2;

public class Masajista extends EquipoDeFútbol {
	private String título;
	private int experiencia;

	public Masajista() {
		super();
		this.setTítulo("");
		this.setExperiencia(0);
		this.labor = "Masajista";
	}

	public Masajista(String nombre, String apellido, int edad, String selección, String título, int experiencia) {
		super(nombre, apellido, edad, selección, "Masajista");
		this.setTítulo(título);
		this.setExperiencia(experiencia);
	}

	void darMasaje() {
		// Acción de dar masaje
	}

	public String getTítulo() {
		return título;
	}

	public void setTítulo(String título) {
		this.título = título;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String toString() {
		String datos = this.labor + "\t\t" + this.nombre + "\t\t" + this.apellido + "\t\t" + this.edad + "\t\t"
				+ this.selección + "\t\t" + this.título + "\t\t" + this.experiencia;
		return datos;
	}

}
