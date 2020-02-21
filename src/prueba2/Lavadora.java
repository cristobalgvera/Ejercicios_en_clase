package prueba2;

public class Lavadora extends Electrodoméstico {
	private double carga;

	// Constructor "vacío" por defecto
	public Lavadora() {
		super();
		this.carga = CARGADEFECTO;
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGADEFECTO;
	}

	public Lavadora(double precioBase, String color, char consumoEnergético, double peso, double carga) {
		super(precioBase, color, consumoEnergético, peso);
		this.carga = carga;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(); // Creamos un objeto para un orden mayor
		sb.append("LAVADORA\n");
		sb.append("\nPrecio base:        \t" + getPrecioBase() + " €");
		sb.append("\nColor:              \t" + getColor());
		sb.append("\nConsumo energético: \t" + getConsumoEnergético());
		sb.append("\nPeso:               \t" + getPeso() + " kg");
		sb.append("\nCarga:              \t" + getCarga() + " kg");
		sb.append("\nPrecio final:       \t" + precioFinal() + " €");
		return sb.toString();
	}

	public double getCarga() {
		return carga;
	}

	double precioFinal() {
		double precioFinal = precioFinalElectrodoméstico(); // Asignamos el valor que entrega el método de la clase
															// padre para luego sumar el valor adherido por la clase
															// hija
		if (getCarga() > 30)
			precioFinal += 50;
		return precioFinal;
	}
}
