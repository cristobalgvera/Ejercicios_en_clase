package trabajoGrupal_proyectoM�dulo;

import java.util.Date;

public class Caguano extends Carro {
	private double alcanceTiro;
	private String colorConfeti;

	public Caguano(int cantidadOcupantes, int[][] posici�n, Date fechaIngreso, double alcanceTiro,
			String colorConfeti) {
		super(cantidadOcupantes, posici�n, fechaIngreso);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
		this.TAMA�O = 2;
		this.TIPO = 'C';
	}

	public Caguano() {
		super();
		this.TAMA�O = 2;
		this.TIPO = 'C';
	}

	@Override
	public boolean comprobarPosici�n(char[][] grilla, int[][] posici�n, int TAMA�O) {
		int fila = posici�n[0][0] - 1, columna = posici�n[0][1] - 1;
		try {
			for (int i = columna; i < columna + TAMA�O; i++) {
				if (grilla[fila][i] != 0) {
					return false;
				}
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public char[][] asignarPosici�n(char[][] grilla, int[][] posici�n, int TAMA�O) {
		int[][] posici�nFinal = new int[TAMA�O][2];
		int fila = posici�n[0][0] - 1, columna = posici�n[0][1] - 1;
		for (int i = columna, j = 0; i < columna + TAMA�O; i++, j++) {
			posici�nFinal[j][0] = fila;
			posici�nFinal[j][1] = i;
			grilla[fila][i] = getTipo();
		}
		setPosici�n(posici�nFinal);
		return grilla;
	}

	public double getAlcanceTiro() {
		return alcanceTiro;
	}

	public void setAlcanceTiro(double alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public String getColorConfeti() {
		return colorConfeti;
	}

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CAGUANO\n");
		builder.append(super.toString());
		int posici�n = builder.indexOf("\nPosici�n");
		builder.insert(posici�n, "\nAlcance de tiro:       \t" + getAlcanceTiro());
		builder.insert(posici�n, "\nColor confeti:         \t" + getColorConfeti());
		return builder.toString();
	}

}
