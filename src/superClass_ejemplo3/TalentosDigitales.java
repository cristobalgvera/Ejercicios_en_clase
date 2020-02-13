package superClass_ejemplo3;

import java.util.*;

public class TalentosDigitales {
	static Scanner scr = new Scanner(System.in);
	static List<Empleado> empleado = new ArrayList<Empleado>();
	static int aux = 0;

	public static void main(String[] args) {
		String resp;
		do {
			resp = "1";
			do {
				if (!Verificador(resp, "1") && !Verificador(resp, "2"))
					System.out.println("****Has ingresado una opción incorrecta, reintente:****\n");
				resp = Menú();
			} while (!Verificador(resp, "1") && !Verificador(resp, "2"));
			switch (resp) {
			case "1":
				inscripciónEmpleado();
				if (preguntaProgramador()) {
					System.out.println("");
					esEmpleadoProgramador();
				}
				aux++;
				break;
			case "2":
				inscripciónProgramador();
				aux++;
				break;
			}
			System.out.println("\n¿Desea ingresar un nuevo empleado? (S/N)");
			resp = scr.nextLine();
			System.out.println();
		} while (Verificador(resp, "s"));
		mostrarEmpleados();
	}

	static void inscripciónEmpleado() {
		empleado.add(new Empleado());
		System.out.print("\nNombre completo: ");
		empleado.get(aux).setNombre(scr.nextLine());
		System.out.print("Cédula de identidad: ");
		empleado.get(aux).setRut(scr.nextLine());
		System.out.print("Edad: ");
		empleado.get(aux).setEdad(Integer.parseInt(scr.nextLine()));
		System.out.print("Casado (S/N): ");
		empleado.get(aux).setCasado(Verificador(scr.nextLine(), "S"));
		System.out.print("Salario: ");
		empleado.get(aux).setSalario(Double.parseDouble(scr.nextLine()));
	}

	static String Menú() {
		System.out.println("TALENTOS DIGITALES\n");
		System.out.println("(1) Empleado\n(2) Programador\n\n¿Qué tipo de trabajador desea ingresar?");
		return scr.nextLine();
	}

	static boolean preguntaProgramador() {
		System.out.println("\n¿Este empleado es un programador? (S/N)");
		return Verificador(scr.nextLine(), "S");
	}

	static boolean Verificador(String a, String b) {
		if (a.equalsIgnoreCase(b)) {
			return true;
		} else {
			return false;
		}
	}

	static void mostrarEmpleados() {
		System.out.println("**************************\n**  DATOS POR EMPLEADO  **\n**************************\n");
		for (int i = 0; i < empleado.size(); i++) {
			System.out.println("**************************\n");
			System.out.println("\n" + empleado.get(i).toString() + "\n");
		}
		System.out.println("**************************");
	}

	static void esEmpleadoProgramador() {
		empleado.set(aux, new Programador(empleado.get(aux).getNombre(), empleado.get(aux).getRut(),
				empleado.get(aux).getEdad(), empleado.get(aux).isCasado(), empleado.get(aux).getSalario(), 0, null));
		System.out.print("Líneas de código por hora: ");
		((Programador) empleado.get(aux)).setLíneasCódigoHora(Integer.parseInt(scr.nextLine()));
		System.out.print("Lenguaje dominante: ");
		((Programador) empleado.get(aux)).setLenguajeDominante(scr.nextLine());
	}

	static void inscripciónProgramador() {
		inscripciónEmpleado();
		esEmpleadoProgramador();
	}

}
