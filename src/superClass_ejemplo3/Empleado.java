package superClass_ejemplo3;

public class Empleado {
	protected String nombre, rut;
	protected int edad;
	protected boolean casado;
	protected double salario;

	public Empleado(String nombre, String rut, int edad, boolean casado, double salario) {
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}

	public Empleado() {

	}

	protected String clasificaci�nEdad() {
		String clasificaci�n = "Intermedio";
		if (this.edad <= 21) {
			clasificaci�n = "Principiante";
		} else if (this.edad > 35) {
			clasificaci�n = "Senior";
		}
		return clasificaci�n;
	}

	void aumentarSalario(double porcentaje) {
		this.salario += this.salario * (porcentaje / 100d);
	}

	public String toString() {
		System.out.println("EMPLEADO");
		String datos = "Nombre: " + this.nombre + "\nC�dula: " + this.rut + "\nEdad: " + this.edad + " ("
				+ clasificaci�nEdad() + ")\nCasado: " + casadoRespuesta() + "\nSalario: " + this.salario;
		return datos;
//		datosEmpleado();
//		return null;
	}

	protected void datosEmpleado() {
		System.out.print("Nombre: " + this.nombre + "\nC�dula: " + this.rut + "\nEdad: " + this.edad + " ("
				+ clasificaci�nEdad() + ")\nCasado: " + casadoRespuesta() + "\nSalario: " + this.salario);
	}

	protected String casadoRespuesta() {
		String casadoBoolean;
		if (this.casado == true) {
			casadoBoolean = "S�";
		} else {
			casadoBoolean = "NO";
		}
		return casadoBoolean;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
