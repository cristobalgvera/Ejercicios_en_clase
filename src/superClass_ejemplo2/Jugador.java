package superClass_ejemplo2;

public class Jugador extends EquipoDeF�tbol {
	private int dorsal;
	private String posici�n;

	Jugador() {
		super();
		this.posici�n = "";
		this.dorsal = 0;
		this.labor = "Jugador";
	}

	Jugador(String nombre, String apellido, int edad, String selecci�n, int dorsal, String posici�n) {
		super(nombre, apellido, edad, selecci�n, "Jugador");
		this.dorsal = dorsal;
		this.posici�n = posici�n;
	}

	void darPase() {
		// Acci�n de dar pase
	}

	void Cabecear() {
		// Acci�n de cabecear
	}

	void Moverse() {
		// Acci�n de moverse
	}

	void recibirBal�n() {
		// Acci�n de recibir un pase
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getPosici�n() {
		return posici�n;
	}

	public void setPosici�n(String posici�n) {
		this.posici�n = posici�n;
	}

	public String toString() {
		String datos = this.labor + "\t\t\t" + this.nombre + "\t\t" + this.apellido + "\t\t" + this.edad + "\t\t"
				+ this.selecci�n + "\t\t" + this.dorsal + "\t\t" + this.posici�n;
		return datos;
	}
}
