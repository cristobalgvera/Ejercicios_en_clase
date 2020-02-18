package superClass_llamadaTelef�nica;

public class Celular extends Tel�fono {
	private int minutosTotales, minutos�ltimaLlamada;

	public Celular() {
		super();
	}

	public void realizarLlamada(int minutos) {
		this.setMinutos�ltimaLlamada(minutos);
		this.setMinutosTotales(this.getMinutosTotales() + minutos);
	}

	public String buscarN�mero(String nombre) {
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
			sb.append("N�mero: +" + contactos.get(aux).getPrefijo() + " " + contactos.get(aux).getN�mero());
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
		sb.append("\nN�mero: \t\t");
		sb.append("+" + contactos.get(aux).getPrefijo() + " " + contactos.get(aux).getN�mero());
		sb.append("\nDuraci�n llamada: \t");
		sb.append(getMinutos�ltimaLlamada());
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

	public int getMinutos�ltimaLlamada() {
		return minutos�ltimaLlamada;
	}

	public void setMinutos�ltimaLlamada(int minutos�ltimaLlamada) {
		this.minutos�ltimaLlamada = minutos�ltimaLlamada;
	}
}
