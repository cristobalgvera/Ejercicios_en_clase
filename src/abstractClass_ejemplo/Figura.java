package abstractClass_ejemplo;

public abstract class Figura {
	protected String color;

	Figura() {

	}

	Figura(String color) {
		this.color = color;
	}

	abstract double calcular¡rea();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nColor: " + getColor());
		sb.append("\n¡rea = " + calcular¡rea() + "\n");
		return sb.toString();
	}

}
