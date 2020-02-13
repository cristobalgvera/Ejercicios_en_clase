package superClass_ejemplo2;

public class Jugador extends EquipoDeFútbol {
	private int dorsal;
	private String posición;

	Jugador() {
		super();
		this.posición = "";
		this.dorsal = 0;
		this.labor = "Jugador";
	}

	Jugador(String nombre, String apellido, int edad, String selección, int dorsal, String posición) {
		super(nombre, apellido, edad, selección, "Jugador");
		this.dorsal = dorsal;
		this.posición = posición;
	}

	void darPase() {
		// Acción de dar pase
	}

	void Cabecear() {
		// Acción de cabecear
	}

	void Moverse() {
		// Acción de moverse
	}

	void recibirBalón() {
		// Acción de recibir un pase
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getPosición() {
		return posición;
	}

	public void setPosición(String posición) {
		this.posición = posición;
	}

	public String toString() {
		String datos = this.labor + "\t\t\t" + this.nombre + "\t\t" + this.apellido + "\t\t" + this.edad + "\t\t"
				+ this.selección + "\t\t" + this.dorsal + "\t\t" + this.posición;
		return datos;
	}
}
