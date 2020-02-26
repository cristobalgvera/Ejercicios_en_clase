package trabajoGrupal_proyectoM�dulo;

public class Huevo implements Posicionable {
	private int posici�n[][], puntaje;
	final private char TIPO = 'H';
	final private int TAMA�O = 1;

	public Huevo(int[][] posici�n) {
		this.posici�n = posici�n;
		this.puntaje = 0;
	}

	public Huevo() {
		this.puntaje = 0;
	}

	@Override
	public char[][] asignarPosici�n(char[][] grilla, int[][] posici�n, int TAMA�O) {
		int fila = posici�n[0][0];
		int columna = posici�n[0][1];
		grilla[fila][columna] = getTipo();
		setPosici�n(posici�n);
		return grilla;
	}

	@Override
	public boolean comprobarPosici�n(char[][] grilla, int[][] posici�n, int TAMA�O) {
		int fila = getPosici�n()[0][0] - 1;
		int columna = getPosici�n()[0][1] - 1;
		try {
			return (fila < grilla.length && columna < grilla[0].length && fila >= 0 && columna >= 0) ? true : false;
		} catch (Exception e) {
			return false;
		}
	}

	public void calcularPuntaje(char carroImpacto, Carro carro) {
		boolean carroInutilizado = carro.getN�meroImpactos() == carro.getTama�o();
		if (carroImpacto != 0 && carroImpacto != TIPO) {
			switch (carroImpacto) {
			case 'K':
				setPuntaje(getPuntaje() + 3);
				if (carroInutilizado)
					setPuntaje(getPuntaje() + 10);
				break;
			case 'C':
				setPuntaje(getPuntaje() + 2);
				if (carroInutilizado)
					setPuntaje(getPuntaje() + 7);
				break;
			case 'T':
				setPuntaje(getPuntaje() + 1);
				break;
			}
		}
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public int[][] getPosici�n() {
		return posici�n;
	}

	public void setPosici�n(int posici�n[][]) {
		this.posici�n = posici�n;
	}

	public char getTipo() {
		return TIPO;
	}

	public int getTama�o() {
		return TAMA�O;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Posici�n:              \t( " + getPosici�n()[0][0] + " , " + getPosici�n()[0][1] + " )");
		builder.append("\nPuntaje:               \t" + getPuntaje());
		return builder.toString();
	}
}
