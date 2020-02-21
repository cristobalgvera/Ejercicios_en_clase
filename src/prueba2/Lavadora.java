package prueba2;

public class Lavadora extends Electrodom�stico {
	private double carga;

	// Constructor "vac�o" por defecto
	public Lavadora() {
		super();
		this.carga = CARGADEFECTO;
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGADEFECTO;
	}

	public Lavadora(double precioBase, String color, char consumoEnerg�tico, double peso, double carga) {
		super(precioBase, color, consumoEnerg�tico, peso);
		this.carga = carga;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(); // Creamos un objeto para un orden mayor
		sb.append("LAVADORA\n");
		sb.append("\nPrecio base:        \t" + getPrecioBase() + " �");
		sb.append("\nColor:              \t" + getColor());
		sb.append("\nConsumo energ�tico: \t" + getConsumoEnerg�tico());
		sb.append("\nPeso:               \t" + getPeso() + " kg");
		sb.append("\nCarga:              \t" + getCarga() + " kg");
		sb.append("\nPrecio final:       \t" + precioFinal() + " �");
		return sb.toString();
	}

	public double getCarga() {
		return carga;
	}

	double precioFinal() {
		double precioFinal = precioFinalElectrodom�stico(); // Asignamos el valor que entrega el m�todo de la clase
															// padre para luego sumar el valor adherido por la clase
															// hija
		if (getCarga() > 30)
			precioFinal += 50;
		return precioFinal;
	}
}
