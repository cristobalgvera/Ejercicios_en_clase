package trabajoGrupal_proyectoM�dulo;

public class Huevo implements Posicionable {
	private int posici�n[][], puntaje;
	final private char TIPO = 'H';
	final private int TAMA�O = 1;

	// Al contrario de lo que se podr�a pensar, la clase huevo asigna un puntaje a
	// cada objeto, por ende, cada huevo representa su utilidad en funci�n de esto

	public Huevo(int[][] posici�n) {
		this.posici�n = posici�n;
		this.puntaje = 0; // Todo huevo comienza con un puntaje cero para mayor facilidad de c�digo
	}

	public Huevo() {
		this.puntaje = 0;
	}

	// M�todos heredados de la interfaz que setean la posici�n del huevo en funci�n
	// de lo ingresado por el usuario

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

	@Override
	public char[][] asignarPosici�n(char[][] grilla, int[][] posici�n, int TAMA�O) {
		int fila = posici�n[0][0];
		int columna = posici�n[0][1];
		grilla[fila][columna] = getTipo();
		setPosici�n(posici�n);
		return grilla;
	}

	// El puntaje depende de los factores solicitados y este representa un atributo
	// del objeto. De todas formas, posteriormente es otorgado al global

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
