package trabajoGrupal_proyectoMódulo;

public class Huevo implements Posicionable {
	private int posición[][], puntaje;
	final private char TIPO = 'H';
	final private int TAMAÑO = 1;

	public Huevo(int[][] posición) {
		this.posición = posición;
		this.puntaje = 0;
	}

	public Huevo() {
		this.puntaje = 0;
	}

	@Override
	public char[][] asignarPosición(char[][] grilla, int[][] posición, int TAMAÑO) {
		int fila = posición[0][0];
		int columna = posición[0][1];
		grilla[fila][columna] = getTipo();
		setPosición(posición);
		return grilla;
	}

	@Override
	public boolean comprobarPosición(char[][] grilla, int[][] posición, int TAMAÑO) {
		int fila = getPosición()[0][0] - 1;
		int columna = getPosición()[0][1] - 1;
		try {
			return (fila < grilla.length && columna < grilla[0].length && fila >= 0 && columna >= 0) ? true : false;
		} catch (Exception e) {
			return false;
		}
	}

	public void calcularPuntaje(char carroImpacto, Carro carro) {
		boolean carroInutilizado = carro.getNúmeroImpactos() == carro.getTamaño();
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

	public int[][] getPosición() {
		return posición;
	}

	public void setPosición(int posición[][]) {
		this.posición = posición;
	}

	public char getTipo() {
		return TIPO;
	}

	public int getTamaño() {
		return TAMAÑO;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Posición:              \t( " + getPosición()[0][0] + " , " + getPosición()[0][1] + " )");
		builder.append("\nPuntaje:               \t" + getPuntaje());
		return builder.toString();
	}
}
