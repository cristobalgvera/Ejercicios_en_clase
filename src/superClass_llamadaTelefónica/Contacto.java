package superClass_llamadaTelef�nica;

public class Contacto extends Tel�fono {
	private String nombre;

	public Contacto() {
		super();
	}

	public Contacto(int prefijo, long n�mero, String nombre) {
		super(prefijo, n�mero);
		this.nombre = nombre;
	}

	public Contacto(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getNombre() + "\t\t\t");
		sb.append("+" + getPrefijo() + " " + getN�mero());
		return sb.toString();
	}

}
