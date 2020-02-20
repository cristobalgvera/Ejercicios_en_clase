package abstractClass_ejemplo;

public class Tri·ngulo extends Figura {
	private double base, altura;

	public Tri·ngulo() {
		super();
	}

	public Tri·ngulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	double calcular¡rea() {
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
