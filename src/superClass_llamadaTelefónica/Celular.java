package superClass_llamadaTelefónica;

public class Celular extends Teléfono {
	private int minutosTotales, minutosÚltimaLlamada;

	public Celular() {
		super();
	}

	public void realizarLlamada(int minutos) {
		this.setMinutosÚltimaLlamada(minutos);
		this.setMinutosTotales(this.getMinutosTotales() + minutos);
	}

	public String buscarNúmero(String nombre) {
		StringBuilder sb = new StringBuilder();
		int aux = 0;
		for (int i = 0; i < contactos.size(); i++) {
			if (nombre.equalsIgnoreCase(contactos.get(i).getNombre())) {
				aux = i;
				break;
			}
		}
//		System.out.println(aux);
		if (aux >= 0) {
			sb.append("Número: +" + contactos.get(aux).getPrefijo() + " " + contactos.get(aux).getNúmero());
		} else {
			sb.append("No ha sido encontrado un contacto con el nombre '" + nombre + "'");
		}
		return sb.toString();
	}

	public String registroLlamadas() {
		StringBuilder sb = new StringBuilder();
		int aux = (int) (Math.random() * (contactos.size()));
		sb.append("Contacto: \t\t");
		sb.append(contactos.get(aux).getNombre());
		sb.append("\nNúmero: \t\t");
		sb.append("+" + contactos.get(aux).getPrefijo() + " " + contactos.get(aux).getNúmero());
		sb.append("\nDuración llamada: \t");
		sb.append(getMinutosÚltimaLlamada());
		sb.append(" minuto(s)\nTotal: \t\t\t");
		sb.append(getMinutosTotales() + " minutos");
		return sb.toString();
	}

	public int getMinutosTotales() {
		return minutosTotales;
	}

	public void setMinutosTotales(int minutosTotales) {
		this.minutosTotales = minutosTotales;
	}

	public int getMinutosÚltimaLlamada() {
		return minutosÚltimaLlamada;
	}

	public void setMinutosÚltimaLlamada(int minutosÚltimaLlamada) {
		this.minutosÚltimaLlamada = minutosÚltimaLlamada;
	}
}
