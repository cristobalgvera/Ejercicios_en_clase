package superClass_ejemplo2;

public class Masajista extends EquipoDeF�tbol {
	private String t�tulo;
	private int experiencia;

	public Masajista() {
		super();
		this.setT�tulo("");
		this.setExperiencia(0);
		this.labor = "Masajista";
	}

	public Masajista(String nombre, String apellido, int edad, String selecci�n, String t�tulo, int experiencia) {
		super(nombre, apellido, edad, selecci�n, "Masajista");
		this.setT�tulo(t�tulo);
		this.setExperiencia(experiencia);
	}

	void darMasaje() {
		// Acci�n de dar masaje
	}

	public String getT�tulo() {
		return t�tulo;
	}

	public void setT�tulo(String t�tulo) {
		this.t�tulo = t�tulo;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String toString() {
		String datos = this.labor + "\t\t" + this.nombre + "\t\t" + this.apellido + "\t\t" + this.edad + "\t\t"
				+ this.selecci�n + "\t\t" + this.t�tulo + "\t\t" + this.experiencia;
		return datos;
	}

}
