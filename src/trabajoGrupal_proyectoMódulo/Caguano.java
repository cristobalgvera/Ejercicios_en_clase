package trabajoGrupal_proyectoMódulo;

import java.util.Date;

public class Caguano extends Carro {
	private double alcanceTiro;
	private String colorConfeti;

	public Caguano(int cantidadOcupantes, int[][] posición, Date fechaIngreso, double alcanceTiro,
			String colorConfeti) {
		super(cantidadOcupantes, posición, fechaIngreso);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
		this.TAMAÑO = 2;
		this.TIPO = 'C';
	}

	public Caguano() {
		super();
		this.TAMAÑO = 2;
		this.TIPO = 'C';
	}

	@Override
	public boolean comprobarPosición(char[][] grilla, int[][] posición, int TAMAÑO) {
		int fila = posición[0][0] - 1, columna = posición[0][1] - 1;
		try {
			for (int i = columna; i < columna + TAMAÑO; i++) {
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
	public char[][] asignarPosición(char[][] grilla, int[][] posición, int TAMAÑO) {
		int[][] posiciónFinal = new int[TAMAÑO][2];
		int fila = posición[0][0] - 1, columna = posición[0][1] - 1;
		for (int i = columna, j = 0; i < columna + TAMAÑO; i++, j++) {
			posiciónFinal[j][0] = fila;
			posiciónFinal[j][1] = i;
			grilla[fila][i] = getTipo();
		}
		setPosición(posiciónFinal);
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
		int posición = builder.indexOf("\nPosición");
		builder.insert(posición, "\nAlcance de tiro:       \t" + getAlcanceTiro());
		builder.insert(posición, "\nColor confeti:         \t" + getColorConfeti());
		return builder.toString();
	}

}
