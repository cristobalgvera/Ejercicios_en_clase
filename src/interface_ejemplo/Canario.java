package interface_ejemplo;

public class Canario implements Canto, Baile {
	
	private String tipo;

	Canario() {
	
	}

	public void Bailar() {
		System.out.println("Bailo como un canario (8)");
	}

	public void Cantar() {
		System.out.println("Piripipiiii piri");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
