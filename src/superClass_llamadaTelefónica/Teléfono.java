package superClass_llamadaTelefónica;

import java.util.ArrayList;
import java.util.List;

public class Teléfono {
	protected static List<Contacto> contactos = new ArrayList<Contacto>();
	protected int prefijo;
	protected long número;

	public Teléfono(int prefijo, long número) {
		this.prefijo = prefijo;
		this.número = número;
	}

	public Teléfono() {
		
	}

	static void agregarContacto(int prefijo, long número, String nombre) {
		contactos.add(new Contacto(prefijo, número, nombre));
	}

	static void agregarContacto(String nombre) {
		contactos.add(new Contacto(nombre));
	}

	static void agregarContacto() {
		contactos.add(new Contacto());
	}

	public int getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(int prefijo) {
		this.prefijo = prefijo;
	}

	public long getNúmero() {
		return número;
	}

	public void setNúmero(long número) {
		this.número = número;
	}

}
