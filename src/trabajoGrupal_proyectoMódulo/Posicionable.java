package trabajoGrupal_proyectoM�dulo;

public interface Posicionable {
	// Esta interfaz representa la posibilidad de un objeto de ser ubicado en un
	// mapa determinado de coordenadas
	char[][] asignarPosici�n(char[][] grilla, int[][] posici�n, int TAMA�O);

	boolean comprobarPosici�n(char[][] grilla, int[][] posici�n, int TAMA�O);
}
