package abstractClass_ejemplo;

public class Triángulo extends Figura {
	private double base, altura;

	public Triángulo() {
		super();
	}

	public Triángulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	double calcularÁrea() {
		return getBase() * getAltura() / 2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
