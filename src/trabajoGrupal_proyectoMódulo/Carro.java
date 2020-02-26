package trabajoGrupal_proyectoMódulo;

import java.util.Date;

public class Carro implements Posicionable {
	protected int cantidadOcupantes, TAMAÑO, númeroImpactos, posición[][];
	protected Date fechaIngreso;
	protected char TIPO;

	public Carro(int cantidadOcupantes, int[][] posición, Date fechaIngreso) {
		this.cantidadOcupantes = cantidadOcupantes;
		this.posición = posición;
		this.fechaIngreso = new Date();
		this.númeroImpactos = 0;
	}

	public Carro() {
		this.númeroImpactos = 0;
	}

	@Override
	public boolean comprobarPosición(char[][] grilla, int[][] posición, int TAMAÑO) {
		int fila = posición[0][0] - 1, columna = posición[0][1] - 1;
		try {
			for (int i = fila; i < fila + TAMAÑO; i++) {
				if (grilla[i][columna] != 0) {
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
		for (int i = fila, j = 0; i < fila + TAMAÑO; i++, j++) {
			posiciónFinal[j][0] = i;
			posiciónFinal[j][1] = columna;
			grilla[i][columna] = getTipo();
		}
		setPosición(posiciónFinal);
		return grilla;
	}

	public void Impactar() {
		setNúmeroImpactos(getNúmeroImpactos() + 1);
	}

	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}

	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}

	public int[][] getPosición() {
		return posición;
	}

	public void setPosición(int[][] posición) {
		this.posición = posición;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public char getTipo() {
		return TIPO;
	}

	public void setTipo(char tipo) {
		this.TIPO = tipo;
	}

	public int getTamaño() {
		return TAMAÑO;
	}

	public void setTamaño(int tamaño) {
		this.TAMAÑO = tamaño;
	}

	public int getNúmeroImpactos() {
		return númeroImpactos;
	}

	public void setNúmeroImpactos(int númeroImpactos) {
		this.númeroImpactos = númeroImpactos;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nCantidad de ocupantes: \t" + getCantidadOcupantes());
		builder.append("\nImpactos recibidos:    \t" + getNúmeroImpactos());
		builder.append("\nFecha de ingreso:      \t" + getFechaIngreso());
		builder.append("\nPosición:              \t");
		for (int i = 0; i < getTamaño(); i++) {
			builder.append("( " + getPosición()[i][0] + " , " + getPosición()[i][1] + " ) ");
		}
		return builder.toString();
	}

}
