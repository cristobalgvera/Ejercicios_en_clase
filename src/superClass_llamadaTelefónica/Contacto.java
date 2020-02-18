package superClass_llamadaTelefónica;

public class Contacto extends Teléfono {
	private String nombre;

	public Contacto() {
		super();
	}

	public Contacto(int prefijo, long número, String nombre) {
		super(prefijo, número);
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
		sb.append("+" + getPrefijo() + " " + getNúmero());
		return sb.toString();
	}

}
