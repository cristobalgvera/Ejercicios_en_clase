package trabajoGrupal_proyectoMódulo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Tablero {
	public static Scanner scr = new Scanner(System.in);
	public static List<Carro> carros = new ArrayList<>(); // ArrayList de clase Carro
	public static List<Huevo> proyectiles = new ArrayList<>(); // ArrayList de clase Huevo
	private static char[][] grilla = new char[15][15]; // Posicionamiento para el sistema
	public static int puntaje = 0, impactosExitosos = 0, carrosPorCategoría[][] = { { 0, 0 }, { 0, 0 }, { 0, 0 } };

	public static void main(String[] args) {
		Huevo huevo;
		int opción = 0;
		boolean permanenciaMenú = true, error = false;
		for (int i = 0; i < 18; i++) {
			if (!crearCarro((int) (Math.random() * 3)))
				break;
		}
//		for (int i = 0; i < grilla.length; i++) {
//			System.out.println(grilla[i]);
//		}
		do {
			if (!error) {
				System.out.print(menúPrincipal());
			} else {
				System.err.print("                ERROR  -> ");
			}
			error = false;
			permanenciaMenú = true;
			try {
				opción = Integer.parseInt(scr.nextLine());
				switch (opción) {
				default:
					error = true;
					break;
				case 1:
					do {
						System.out.print(imprimirTableroPuntaje());
						huevo = lanzarHuevo();
						if (huevo != null) {
							impactarCarro(huevo, lanzarProyectil(huevo));
						} else {
							permanenciaMenú = false;
						}
					} while (permanenciaMenú);
					permanenciaMenú = true;
					break;
				case 2:
					System.out.print(imprimirTableroPuntaje());
					if (proyectiles.size() > 0)
						System.out.println(datosProyectiles() + "\n");
					if (carros.size() > 0)
						System.out.println(datosCarros());
					System.out.print("\n\nPRESIONA ENTER PARA CONTINUAR");
					scr.nextLine();
					break;
				case 3:
					System.out
							.println("\n\n═════════════════════════════════════════════════════════════════════════\n");
					System.err.println(gameOver());
					permanenciaMenú = false;
					break;
				}
			} catch (Exception e) {
				permanenciaMenú = true;
				error = true;
			}
			if (permanenciaMenú && !error)
				System.out.println("\n\n═════════════════════════════════════════════════════════════════════════\n\n");
		} while (permanenciaMenú);
	}

	// La acción "crear un carro" se ejecuta y de inmediato se correlaciona con una
	// posición correcta para el objeto, en caso de no se encontrada esta, el
	// programa finaliza sus ciclos y devuelve las posiciones que pudo otorgar

	static boolean crearCarro(int categoría) {
		switch (categoría) {
		case 0:
			carros.add(new Kromi());
			break;
		case 1:
			carros.add(new Caguano());
			break;
		case 2:
			carros.add(new Trupalla());
			break;
		}
		if (Posicionamiento(carros.get(carros.size() - 1))) {
			carrosPorCategoría[categoría][0]++;
			return true;
		} else {
			return false;
		}
	}

	// Este método entrega una coordenada correcta para el tipo de objeto que se
	// solicite. En caso de no encontrarla al 10∧5 intento, el método concluye.

	static boolean Posicionamiento(Carro carro) {
		int[][] posición;
		int intentos = 0;
		do {
			int fila = (int) (Math.random() * grilla.length);
			int columna = (int) (Math.random() * grilla[0].length);
			posición = new int[1][2];
			{
				posición[0][0] = fila;
				posición[0][1] = columna;
			}
			if (intentos > Math.pow(10, 5))
				break;
			intentos++;
//			System.out.println(intentos + " - " + fila + " - " + columna + " - " + carro.getClass());
		} while (!carro.comprobarPosición(grilla, posición, carro.getTamaño()));
		if (intentos <= Math.pow(10, 5)) {
			grilla = carro.asignarPosición(grilla, posición, carro.getTamaño());
			return true;
		} else {
			carros.remove(carros.size() - 1);
			return false;
		}
	}

	// Este método representa la creación, el lanzamiento y el impacto de un objeto
	// {Huevo}, divididos en distintos métodos. Esas acciones están representadas
	// por los métodos {crearProyectil()}, {lanzarProyectil()} e {impactarCarro()},
	// respectivamente. En conclusión, la acción consecutiva de estos tres métodos
	// mencionados representa "lanzar un huevo"

	static Huevo lanzarHuevo() {
		boolean creación;
		int[][] posición = new int[1][2];
		Huevo huevo = null;
		System.out.println("LANZAR HUEVO:\n\n[0,0]: Salir\n");
		do {
			creación = true;
			System.out.print("Columna: ");
			String columna = scr.nextLine();
			System.out.print("Fila:    ");
			String fila = scr.nextLine();
			if (fila.equalsIgnoreCase("0") && columna.equalsIgnoreCase("0"))
				break;
			try {
				{
					posición[0][0] = 16 - Integer.parseInt(fila);
					posición[0][1] = Integer.parseInt(columna);
				}
				huevo = crearProyectil(posición);
				creación = huevo.comprobarPosición(grilla, huevo.getPosición(), huevo.getTamaño());
			} catch (Exception e) {
				creación = false;
			}
			if (!creación) {
				System.out.println("\n*************************************");
				System.out.println("  PARÁMETROS INCORRECTOS, REINTENTE  ");
				System.out.println("*************************************\n");
			}
		} while (!creación);
		return huevo;
	}

	static Huevo crearProyectil(int[][] posición) {
		proyectiles.add(new Huevo(posición));
		return proyectiles.get(proyectiles.size() - 1);
	}

	// A partir de este método (que es parte de la acción "lanzar un huevo"), sólo
	// es posible ejecutarlos si la creación del huevo es exitosa, esto se traduce
	// en que la creación comprobó que la posición es correcta

	static char lanzarProyectil(Huevo huevo) {
		int fila = huevo.getPosición()[0][0] - 1;
		int columna = huevo.getPosición()[0][1] - 1;
		char carroImpacto = grilla[fila][columna];
		int[][] posición = { { fila, columna } };
		grilla = huevo.asignarPosición(grilla, posición, huevo.getTamaño());
		return carroImpacto;
	}

	static void impactarCarro(Huevo huevo, char carroImpacto) {
		Carro carro;
		int filaHuevo = huevo.getPosición()[0][0];
		int columnaHuevo = huevo.getPosición()[0][1];
		if (carroImpacto != huevo.getTipo()) {
			for (int i = 0; i < carros.size(); i++) {
				carro = carros.get(i);
				for (int j = 0; j < carro.getTamaño(); j++) {
					int filaCarro = carro.getPosición()[j][0];
					int columnaCarro = carro.getPosición()[j][1];
//				System.out.println(filaHuevo + " - " + columnaHuevo + " | " + filaCarro + " - " + columnaCarro + ": "
//						+ carro.getClass());
					if (filaHuevo == filaCarro && columnaHuevo == columnaCarro) {
						carro.Impactar();
						huevo.calcularPuntaje(carroImpacto, carro);
						puntaje += huevo.getPuntaje();
						impactosExitosos++;
						i = carros.size();
						break;
					}
				}
			}
		}
	}

	// Métodos que crean la grilla estructurada de forma visual
	// Cada método {imprimirX()} representa interfaz visual para el usuario

	public static String imprimirTablero() {
		StringBuilder builder = new StringBuilder();
		int tamaño = grilla.length;
		imprimirBordeSuperior(builder);
		for (int fila = 0; fila < tamaño; fila++) {
			imprimirBordeIzquierdo(builder, fila);
			for (int columna = 0; columna < tamaño; columna++) {
				imprimirValor(builder, grilla, fila, columna);
				imprimirBordeColumna(builder, columna + 1, tamaño);
			}
			imprimirBordeDerecho(builder, fila);
			builder.append("\n");
			imprimirBordeInferiorFila(builder, fila + 1, tamaño);
		}
		imprimirBordeInferior(builder);
		return builder.toString();
	}

	static void imprimirBordeSuperior(StringBuilder builder) {
//		builder.append("                                           1   1   1   1   1   1  \n");
		builder.append("       1   2   3   4   5   6   7   8   9   0   1   2   3   4   5  \n\n");
		builder.append("     ╔═══╤═══╤═══╤═══╤═══╦═══╤═══╤═══╤═══╤═══╦═══╤═══╤═══╤═══╤═══╗\n");
	}

	static void imprimirBordeInferior(StringBuilder builder) {
		builder.append("     ╚═══╧═══╧═══╧═══╧═══╩═══╧═══╧═══╧═══╧═══╩═══╧═══╧═══╧═══╧═══╝\n\n");
		builder.append("       1   2   3   4   5   6   7   8   9   0   1   2   3   4   5  \n");
//		builder.append("                                           1   1   1   1   1   1  \n");
	}

	static void imprimirBordeIzquierdo(StringBuilder builder, int fila) {
		if (fila > 5) {
			builder.append(" " + (15 - fila) + "   ║");
		} else {
			builder.append((15 - fila) + "   ║");
		}
	}

	static void imprimirBordeDerecho(StringBuilder builder, int fila) {
		builder.append("║   " + (15 - fila));

	}

	static void imprimirBordeInferiorFila(StringBuilder builder, int fila, int tamaño) {
		if (fila == tamaño) {
			return;
		}
		if (fila % 5 == 0) {
			builder.append("     ╠═══╪═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╪═══╬═══╪═══╪═══╪═══╪═══╣\n");
		} else {
			builder.append("     ╟───┼───┼───┼───┼───╫───┼───┼───┼───┼───╫───┼───┼───┼───┼───╢\n");
		}
	}

	static void imprimirBordeColumna(StringBuilder builder, int columna, int tamaño) {
		if (columna == tamaño) {
			return;
		}
		if (columna % 5 == 0) {
			builder.append("║");
		} else {
			builder.append("│");
		}
	}

	static void imprimirValor(StringBuilder builder, char[][] grilla, int fila, int columna) {
		char valor = grilla[fila][columna];
		String salida = (valor != 0) ? String.valueOf(valor) : " ";
		builder.append(" " + salida + " ");
	}

	static String imprimirTableroPuntaje() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n\n═════════════════════════════════════════════════════════════════════════\n\n");
		builder.append(imprimirTablero());
		builder.append("\n\n                   ╔════════════════════════════════╗\n");
		if (puntaje < 10) {
			builder.append("═══════════════════╣       P U N T A J E :   " + puntaje + "      ╠════════════════════");
		} else if (puntaje < 100) {
			builder.append("═══════════════════╣       P U N T A J E :   " + puntaje + "     ╠════════════════════");
		} else {
			builder.append("═══════════════════╣      P U N T A J E :   " + puntaje + "     ╠════════════════════");
		}
		builder.append("\n                   ╚════════════════════════════════╝\n\n");
		return builder.toString();
	}

	// Interfaz para el usuario que determina información relevante
	// Sólo son cadenas de texto

	static String menúPrincipal() {
		StringBuilder builder = new StringBuilder();
		builder.append("                ╔═══════════════════════════════════╗\n");
		builder.append("                ║    F  I  R  S  T    L  I  N  E    ║\n");
		builder.append("                ╚═══════════════════════════════════╝\n");
		builder.append("\n                         (1)   COMENZAR\n");
		builder.append("\n                         (2)   ESTADÍSTICAS\n");
		builder.append("\n                         (3)   SALIR\n");
		builder.append("\n                       -> ");
		return builder.toString();
	}

	static String gameOver() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n");
		builder.append("                ═╬═════════════════════════════════╬═\n");
		builder.append("                 ║    G  A  M  E     O  V  E  R    ║ \n");
		builder.append("                ═╬═════════════════════════════════╬═\n");
		return builder.toString();
	}

	public static String datosProyectiles() {
		double porcentajeÉxito = Math.round((impactosExitosos * 100 / proyectiles.size()) * 100d) / 100d;
		StringBuilder builder = new StringBuilder();
		builder.append("╔═════════════════════════════╗\n");
		builder.append("║    P R O Y E C T I L E S    ║\n");
		builder.append("╚═════════════════════════════╝\n");
		builder.append("\n║  Lanzamientos realizados:     \t" + proyectiles.size());
		builder.append("\n║  Lanzamientos exitosos:       \t" + impactosExitosos);
		builder.append("\n║  Porcentaje de éxito:         \t" + porcentajeÉxito + " %");
		return builder.toString();
	}

	public static String datosCarros() {
		int carrosInhabilitados = 0;
		for (int i = 0; i < carrosPorCategoría.length; i++) {
			carrosInhabilitados += carrosPorCategoría[i][1];
		}
		StringBuilder builder = new StringBuilder();
		builder.append("╔═════════════════════╗\n");
		builder.append("║     C A R R O S     ║\n");
		builder.append("╚═════════════════════╝\n");
		builder.append("\nCantidad inicial de carros:     \t" + carros.size());
		builder.append("\n\n║  Kromis:                      \t" + carrosPorCategoría[0][0]);
		builder.append("\n║  Caguanos:                    \t" + carrosPorCategoría[1][0]);
		builder.append("\n║  Trupallas:                   \t" + carrosPorCategoría[2][0]);
		builder.append("\n\nCantidad actual de carros:      \t" + (carros.size() - carrosInhabilitados) + "\t(-"
				+ carrosInhabilitados + ")");
		builder.append("\n\n║  Kromis:                      \t" + (carrosPorCategoría[0][0] - carrosPorCategoría[0][1])
				+ "\t(-" + carrosPorCategoría[0][1] + ")");
		builder.append("\n║  Caguanos:                    \t" + (carrosPorCategoría[1][0] - carrosPorCategoría[0][1])
				+ "\t(-" + carrosPorCategoría[1][1] + ")");
		builder.append("\n║  Trupallas:                   \t" + (carrosPorCategoría[2][0] - carrosPorCategoría[0][1])
				+ "\t(-" + carrosPorCategoría[2][1] + ")");
		return builder.toString();
	}
}
