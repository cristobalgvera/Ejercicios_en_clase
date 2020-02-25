package prueba2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	static List<Electrodoméstico> electrodoméstico = new ArrayList<Electrodoméstico>(); // Creamos un arreglo dinámico
																						// para agregar
																						// electrodomésticos
																						// independiente de la cantidad
	static double[] preciosFinales = new double[3]; // Arreglo de ayuda para sumar y almacenar los precios finales de
													// cada electrodoméstico

	public static void main(String[] args) {
		llenarArray(20); // El método solicita la cantidad de electrodomésticos a evaluar
		sumarPrecios();
		mostrarObjetos();
		mostrarPrecios();
	}

	static void llenarArray(int cantidadElectrodomésticos) { // Con este valor de entrada logramos que el usuario decida
																// la cantidad de electrodomésticos a evaluar
		// Cada variable es utilizada para entregar valores aleatóreos en los atributos
		// de cada electrodoméstico, esto al momento de crearlos
		int aux, aux2, precioBase;
		String color;
		char consumoEnergético;
		double peso, carga, resolución;
		boolean sintonizadorTDT;

		for (int i = 0; i < cantidadElectrodomésticos + 1; i++) { // Ciclo de creación de electrodomésticos
			aux = (int) (Math.random() * 3); // Asigna el tipo de electrodoméstico para cada objeto (Electrodoméstico,
												// Lavadora o Televisión; 0, 1 y 2, respectivamente)
			aux2 = (int) (Math.random() * (Electrodoméstico.arrayConsumoEnergético.length));
			consumoEnergético = Electrodoméstico.arrayConsumoEnergético[aux2]; // De acuerdo al número aleatóreo "aux2"
																				// es asignado un valor del arreglo
																				// arrayConsumoEnergético[]
			aux2 = (int) (Math.random() * (Electrodoméstico.arrayColores.length));
			color = Electrodoméstico.arrayColores[aux2]; // De acuerdo al nuevo número aleatóreo "aux2" es asignado un
															// valor del arreglo arrayColores[]
			precioBase = (int) (Math.random() * 40) + 20;
			peso = Math.round((Math.random() * 100) * 100d) / 100d; // Redondeamos el valor del atributo peso del objeto
																	// a máximo dos decimales
			switch (aux) { // Utilizamos el valor aleatóreo de la variable "aux" para crear
							// electrodomésticos
			case 0:
				electrodoméstico.add(new Electrodoméstico(precioBase, color, consumoEnergético, peso));
				break;
			case 1:
				carga = Math.round((Math.random() * 60) * 100d) / 100d; // Redondeamos el valor del atributo carga del
																		// objeto a máximo dos decimales
				electrodoméstico.add(new Lavadora(precioBase, color, consumoEnergético, peso, carga));
				break;
			default:
				resolución = Math.round((Math.random() * 40 + 20) * 100d) / 100d; // Redondeamos el valor del atributo
																					// resolución del objeto a máximo
																					// dos decimales
				sintonizadorTDT = (Math.random() > 0.5); // Variable booleana asignada de manera aleatórea de acuerdo a
															// la función Math.random()
				electrodoméstico
						.add(new Televisión(precioBase, color, consumoEnergético, peso, resolución, sintonizadorTDT));
				break;
			}
		}
		electrodoméstico.remove(0); // Removemos el primer objeto del ArrayList debido a un fallo que no pudo ser
									// solucionado. ERROR: Los atributos color y consumoEnergético quedan nulos para
									// el primer objeto. Esta solución es poco elegante pero útil
	}

	static void sumarPrecios() {
		for (int i = 0; i < electrodoméstico.size(); i++) {
			// Separamos cada objeto de acuerdo a su clase gracias al operador instanceof y
			// asignamos el valor del precio final de cada objeto al arreglo
			// preciosFinales[]
			if (electrodoméstico.get(i) instanceof Electrodoméstico) {
				preciosFinales[0] += electrodoméstico.get(i).precioFinalElectrodoméstico();
				if (electrodoméstico.get(i) instanceof Televisión) {
					preciosFinales[0] += ((Televisión) electrodoméstico.get(i)).precioFinal()
							- electrodoméstico.get(i).precioFinalElectrodoméstico(); // Utilizamos esta solución
																						// matemática para evitar el uso
																						// excesivo de condicionales if
					preciosFinales[2] += ((Televisión) electrodoméstico.get(i)).precioFinal();
				} else if (electrodoméstico.get(i) instanceof Lavadora) {
					preciosFinales[0] += ((Lavadora) electrodoméstico.get(i)).precioFinal()
							- electrodoméstico.get(i).precioFinalElectrodoméstico(); // Utilizamos esta solución
																						// matemática para evitar el uso
																						// excesivo de condicionales if
					preciosFinales[1] += ((Lavadora) electrodoméstico.get(i)).precioFinal();
				}
			}
		}
	}

	static void mostrarObjetos() {
		System.out.println("***********************************\nLISTADO DE ELECTRODOMÉSTICOS");
		System.out.println("***********************************");
		for (int i = 0; i < electrodoméstico.size(); i++) {
			System.out.println("\n" + (i + 1) + ": " + electrodoméstico.get(i)); // Utilizamos el método toString() de
																					// cada clase para imprimir los
																					// objetos
			System.out.println("\n***********************************");
		}
		System.out.println("***********************************\n");
	}

	static void mostrarPrecios() {
		System.out.println("PRECIOS FINALES POR CATEGORÍA\n");
		for (int i = 0; i < preciosFinales.length; i++) {
			switch (i) {
			case 0:
				System.out.print("ELECTRODOMÉSTICOS: \t");
				break;
			case 1:
				System.out.print("LAVADORAS:         \t");
				break;
			default:
				System.out.print("TELEVISORES:       \t");
				break;
			}
			System.out.println(Math.round(preciosFinales[i] * 100d) / 100d + " €"); // Redondemos el valor total de cada
																					// electrodoméstico a máximo dos
																					// decimales
		}
		System.out.println("\n***********************************");
	}

}
