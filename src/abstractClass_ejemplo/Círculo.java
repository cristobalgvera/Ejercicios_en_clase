package abstractClass_ejemplo;

public class CÌrculo extends Figura {
	private double radio;

	public CÌrculo() {
		super();
	}

	public CÌrculo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	double calcular¡rea() {
		return Math.round((Math.PI * Math.pow(getRadio(), 2)) * 100d) / 100d;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

}
