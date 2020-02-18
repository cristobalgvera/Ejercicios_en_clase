package superClass_llamadaTelef�nica;

import java.util.ArrayList;
import java.util.List;

public class Tel�fono {
	protected static List<Contacto> contactos = new ArrayList<Contacto>();
	protected int prefijo;
	protected long n�mero;

	public Tel�fono(int prefijo, long n�mero) {
		this.prefijo = prefijo;
		this.n�mero = n�mero;
	}

	public Tel�fono() {
		
	}

	static void agregarContacto(int prefijo, long n�mero, String nombre) {
		contactos.add(new Contacto(prefijo, n�mero, nombre));
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

	public long getN�mero() {
		return n�mero;
	}

	public void setN�mero(long n�mero) {
		this.n�mero = n�mero;
	}

}
