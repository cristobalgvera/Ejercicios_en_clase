package trabajoGrupal_proyectoMódulo;

public interface Posicionable {
	char[][] asignarPosición(char[][] grilla, int[][] posición, int TAMAÑO);
	boolean comprobarPosición(char[][] grilla, int[][] posición, int TAMAÑO);
}
