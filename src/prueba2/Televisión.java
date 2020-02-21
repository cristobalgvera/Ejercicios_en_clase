package prueba2;

public class Televisión extends Electrodoméstico {
	private double resolución;
	private boolean sintonizadorTDT;

	// Constructor "vacío" por defecto
	public Televisión() {
		super();
		this.resolución = RESOLUCIÓNDEFECTO;
		this.sintonizadorTDT = SINTONIZADORTDTDEFECTO;
	}

	public Televisión(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolución = RESOLUCIÓNDEFECTO;
		this.sintonizadorTDT = SINTONIZADORTDTDEFECTO;
	}

	public Televisión(double precioBase, String color, char consumoEnergético, double peso, double resolución,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergético, peso);
		this.resolución = resolución;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(); // Creamos un objeto para un orden mayor
		sb.append("TELEVISIÓN\n");
		sb.append("\nPrecio base:        \t" + getPrecioBase() + " €");
		sb.append("\nColor:              \t" + getColor());
		sb.append("\nConsumo energético: \t" + getConsumoEnergético());
		sb.append("\nPeso:               \t" + getPeso() + " kg");
		sb.append("\nResolución:         \t" + getResolución() + " in");
		sb.append("\nSintonizador TDT:   \t" + validadorSintonizadorTDT(isSintonizadorTDT()));
		sb.append("\nPrecio final:       \t" + Math.round(precioFinal() * 100d) / 100d + " €");
		return sb.toString();
	}

	double precioFinal() {
		double precioFinal = precioFinalElectrodoméstico(); // Asignamos el valor que entrega el método de la clase
															// padre para luego sumar el valor adherido por la clase
															// hija
		if (isSintonizadorTDT())
			precioFinal += 50;
		if (getResolución() > 40)
			precioFinal *= 1.3;
		return precioFinal;
	}

	String validadorSintonizadorTDT(boolean sintonizadorTDT) { // Este método sólo es útil para entregar una respuesta
																// coherente para el usuario en el método toString(), en
																// específico, evitar mostrar "true" o "false", y cambio
																// ello por "SÍ" o "NO", respectivamente
		if (sintonizadorTDT) {
			return "SÍ";
		} else {
			return "NO";
		}
	}

	public double getResolución() {
		return resolución;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
}
