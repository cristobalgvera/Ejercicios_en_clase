package superClass_ejemplo3;

public class Programador extends Empleado {
	private int líneasCódigoHora;
	private String lenguajeDominante;

	public Programador(String nombre, String rut, int edad, boolean casado, double salario, int lineasCódigoHora,
			String lenguajeDominante) {
		super(nombre, rut, edad, casado, salario);
		this.setLíneasCódigoHora(lineasCódigoHora);
		this.setLenguajeDominante(lenguajeDominante);
	}

	public Programador() {

	}

	public String toString() {
		System.out.println("PROGRAMADOR\n");
		datosEmpleado();
		String datos = "Líneas de código por hora: " + this.líneasCódigoHora + "\nLenguaje dominante: "
				+ this.lenguajeDominante;
		return datos;
	}

	public String getLenguajeDominante() {
		return lenguajeDominante;
	}

	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}

	public int getLíneasCódigoHora() {
		return líneasCódigoHora;
	}

	public void setLíneasCódigoHora(int lineasCódigoHora) {
		this.líneasCódigoHora = lineasCódigoHora;
	}
}
