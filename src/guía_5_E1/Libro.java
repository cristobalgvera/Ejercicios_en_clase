package guía_5_E1;

public class Libro {
	private String libro, autor;
	private int ejemplares, ejemplaresPrestados;

	Libro() {
		this.libro = "";
		this.autor = "";
		this.ejemplares = 0;
		this.ejemplaresPrestados = 0;
	}

	Libro(String libro, String autor, int ejemplares, int ejemplaresPrestados) {
		this.libro = libro;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	void Préstamo() {
		ejemplaresPrestados++;
	}

	void Devolución() {
		ejemplaresPrestados--;
	}

	public String getLibro() {
		return libro;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	public String toString() {
		String productDetail = getLibro() + "\t" + getAutor() + "\t" + getEjemplares() + "\t"
				+ getEjemplaresPrestados();
		return productDetail;
	}
}
