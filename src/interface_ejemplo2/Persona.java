package interface_ejemplo2;

public class Persona implements Movible {
	private String nombre;
	private int movimiento;

	Persona() {

	}

	Persona(String nombre, int movimiento) {
		this.nombre = nombre;
		this.movimiento = movimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(int movimiento) {
		this.movimiento = movimiento;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nHola ");
		sb.append(this.nombre);
		return sb.toString();
	}

	@Override
	public void Mover(int sentido) {
		this.movimiento += sentido;
	}
}
