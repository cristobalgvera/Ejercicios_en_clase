package trabajoGrupal_proyectoMódulo;

public interface Posicionable {
	// Esta interfaz representa la posibilidad de un objeto de ser ubicado en un
	// mapa determinado de coordenadas
	char[][] asignarPosición(char[][] grilla, int[][] posición, int TAMAÑO);

	boolean comprobarPosición(char[][] grilla, int[][] posición, int TAMAÑO);
}
