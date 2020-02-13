package superClass_ejemplo3;

public class Programador extends Empleado {
	private int l�neasC�digoHora;
	private String lenguajeDominante;

	public Programador(String nombre, String rut, int edad, boolean casado, double salario, int lineasC�digoHora,
			String lenguajeDominante) {
		super(nombre, rut, edad, casado, salario);
		this.setL�neasC�digoHora(lineasC�digoHora);
		this.setLenguajeDominante(lenguajeDominante);
	}

	public Programador() {

	}

	public String toString() {
		System.out.println("PROGRAMADOR\n");
		datosEmpleado();
		String datos = "L�neas de c�digo por hora: " + this.l�neasC�digoHora + "\nLenguaje dominante: "
				+ this.lenguajeDominante;
		return datos;
	}

	public String getLenguajeDominante() {
		return lenguajeDominante;
	}

	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}

	public int getL�neasC�digoHora() {
		return l�neasC�digoHora;
	}

	public void setL�neasC�digoHora(int lineasC�digoHora) {
		this.l�neasC�digoHora = lineasC�digoHora;
	}
}
