package trabajoGrupal_proyectoMódulo;

public class Huevo implements Posicionable {
	private int posición[][], puntaje;
	final private char TIPO = 'H';
	final private int TAMAÑO = 1;

	// Al contrario de lo que se podría pensar, la clase huevo asigna un puntaje a
	// cada objeto, por ende, cada huevo representa su utilidad en función de esto

	public Huevo(int[][] posición) {
		this.posición = posición;
		this.puntaje = 0; // Todo huevo comienza con un puntaje cero para mayor facilidad de código
	}

	public Huevo() {
		this.puntaje = 0;
	}

	// Métodos heredados de la interfaz que setean la posición del huevo en función
	// de lo ingresado por el usuario

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

	@Override
	public char[][] asignarPosición(char[][] grilla, int[][] posición, int TAMAÑO) {
		int fila = posición[0][0];
		int columna = posición[0][1];
		grilla[fila][columna] = getTipo();
		setPosición(posición);
		return grilla;
	}

	// El puntaje depende de los factores solicitados y este representa un atributo
	// del objeto. De todas formas, posteriormente es otorgado al global

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
