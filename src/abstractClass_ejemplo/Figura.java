package abstractClass_ejemplo;

public abstract class Figura {
	protected String color;

	Figura() {

	}

	Figura(String color) {
		this.color = color;
	}

	abstract double calcularÁrea();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nColor: " + getColor());
		sb.append("\nÁrea = " + calcularÁrea() + "\n");
		return sb.toString();
	}

}
