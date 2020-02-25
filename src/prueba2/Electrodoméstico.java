package prueba2;

public class Electrodoméstico implements CaracterísticasDefecto {
	protected String color;
	protected char consumoEnergético;
	protected double peso, precioBase;;

	// Creamos un arreglo de caracteres e incluimos los consumos disponibles para
	// seleccionar
	public static char[] arrayConsumoEnergético = new char[6];
	{
		arrayConsumoEnergético[0] = 'A';
		arrayConsumoEnergético[1] = 'B';
		arrayConsumoEnergético[2] = 'C';
		arrayConsumoEnergético[3] = 'D';
		arrayConsumoEnergético[4] = 'E';
		arrayConsumoEnergético[5] = 'F';
	}

	// Creamos y llenamos un arreglo de colores disponibles para seleccionar
	public static String[] arrayColores = new String[5];
	{
		arrayColores[0] = "BLANCO";
		arrayColores[1] = "NEGRO";
		arrayColores[2] = "ROJO";
		arrayColores[3] = "AZUL";
		arrayColores[4] = "GRIS";
	}

	public Electrodoméstico(double precioBase, String color, char consumoEnergético, double peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color); // Evitamos que sea ingresado un color incorrecto
		this.consumoEnergético = comprobarConsumoEnergético(consumoEnergético); // Evitamos que sea ingresado un consumo
																				// incorrecto
		this.peso = peso;
	}

	// Constructor "vacío" por defecto
	public Electrodoméstico() {
		this.precioBase = PRECIOBASEDEFECTO;
		this.color = COLORDEFECTO;
		this.consumoEnergético = CONSUMOENERGÉTICODEFECTO;
		this.peso = PESODEFECTO;
	}

	public Electrodoméstico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLORDEFECTO;
		this.consumoEnergético = CONSUMOENERGÉTICODEFECTO;
		this.peso = peso;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder(); // Creamos un objeto para un orden mayor
		builder.append("ELECTRODOMÉSTICO\n");
		builder.append("\nPrecio base:        \t" + getPrecioBase() + " €");
		builder.append("\nColor:              \t" + getColor());
		builder.append("\nConsumo energético: \t" + getConsumoEnergético());
		builder.append("\nPeso:               \t" + getPeso() + " kg");
		builder.append("\nPrecio final:       \t" + precioFinalElectrodoméstico() + " €");
		return builder.toString();
	}

	double precioFinalElectrodoméstico() { // Este nombre para el método precioFinal() es exclusivo de la clase
											// Electrodoméstico. En otras clases simplemente es llamado precioFinal()
		double precioFinal = getPrecioBase(); // Creamos una variable que asigne el valor final recopilado en este
												// método

		// Arreglo de precios acorde al consumo. Tiene directa relación con el arreglo
		// arrayConsumoEnergético[]
		double[] costoConsumo = new double[6];
		{
			costoConsumo[0] = 100;
			costoConsumo[1] = 80;
			costoConsumo[2] = 60;
			costoConsumo[3] = 50;
			costoConsumo[4] = 30;
			costoConsumo[5] = 10;
		}

		// Arreglo de precios acorde al peso del electrodoméstico. Su utilidad no se ve
		// reflejada directamente en este código
		double[] costoPeso = new double[4];
		{
			costoPeso[0] = 10;
			costoPeso[1] = 50;
			costoPeso[2] = 80;
			costoPeso[3] = 100;
		}

		for (int i = 0; i < arrayConsumoEnergético.length; i++) {
			// Comparamos el caracter ingresado con los alojados en nuestro arreglo, es
			// decir, con los únicos posibles. Si es correcto, es asignado el precio
			// correspondiente al arreglo antiormente mencionado
			if (Character.toUpperCase(getConsumoEnergético()) == arrayConsumoEnergético[i]) {
				precioFinal += costoConsumo[i];
				break;
			}
		}

		// Comparamos el peso del electrodoméstico y le asignamos su costo extra
		// correspondiente
		if (getPeso() < 20) {
			precioFinal += costoPeso[0];
		} else if (getPeso() >= 20 && getPeso() < 50) {
			precioFinal += costoPeso[1];
		} else if (getPeso() >= 50 && getPeso() < 80) {
			precioFinal += costoPeso[2];
		} else {
			precioFinal += costoPeso[3];
		}

		return precioFinal;
	}

	String comprobarColor(String color) {
		boolean colorCorrecto = false;
		try {
			for (int i = 0; i < arrayColores.length; i++) {
				// Comparamos el color ingresado con nuestra lista de colores disponibles, si
				// este se encuentra, el color es asignado al objeto, de otro modo, el valor
				// asignado es el por defecto
				if (color.equalsIgnoreCase(arrayColores[i])) {
					colorCorrecto = true;
					break;
				}
			}
			if (!colorCorrecto) {
				return COLORDEFECTO;
			} else {
				return color.toUpperCase(); // Siempre devolvemos valores en mayúsculas
			}
		} catch (Exception e) { // En caso que el valor ingresado no sea válido para el método
			return COLORDEFECTO;
		}
	}

	char comprobarConsumoEnergético(char consumoEnergético) {
		boolean consumoCorrecto = false;
		try {
			for (int i = 0; i < arrayConsumoEnergético.length; i++) {
				// Comparamos el consumo ingresado con nuestra lista de consumos disponibles, si
				// este se encuentra, el consumo es asignado al objeto, de otro modo, el valor
				// asignado es el por defecto
				if (Character.toUpperCase(consumoEnergético) == arrayConsumoEnergético[i]) {
					consumoCorrecto = true;
					break;
				}
			}
			if (!consumoCorrecto) {
				return CONSUMOENERGÉTICODEFECTO;
			} else {
				return Character.toUpperCase(consumoEnergético); // Siempre devolvemos valores en mayúsculas
			}
		} catch (Exception e) { // En caso que el valor ingresado no sea válido para el método
			return CONSUMOENERGÉTICODEFECTO;
		}
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergético() {
		return consumoEnergético;
	}

	public double getPeso() {
		return peso;
	}

}
