package superClass_ejemplo3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejecución {
	static Scanner scr = new Scanner(System.in);
	static List<Empleado> empleado = new ArrayList<Empleado>();
	static int aux = 0;
	static String resp;

	static void Inscripción() {
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
	}

	static String Menú() {
		System.out.println("TALENTOS DIGITALES\n");
		System.out.println("(1) Empleado\n(2) Programador\n\n¿Qué tipo de trabajador desea ingresar?");
		return scr.nextLine();
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
		if (aux == 0)
			System.out.println("NO HAY EMPLEADOS INSCRITOS\n");
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

	static void opcionesFinales() {
		do {
			resp = "1";
			do {
				if (!Verificador(resp, "1") && !Verificador(resp, "2") && !Verificador(resp, "3")
						&& !Verificador(resp, "4"))
					System.out.println("****Has ingresado una opción incorrecta, reintente:****\n");
				resp = menúFinal();
			} while (!Verificador(resp, "1") && !Verificador(resp, "2") && !Verificador(resp, "3")
					&& !Verificador(resp, "4"));
			System.out.println();
			switch (resp) {
			case "1":
				mostrarEmpleados();
				break;
			case "2":
				eliminarEmpleado();
				break;
			case "3":
				Inscripción();
				resp = "3";
				break;
			case "4":
				resp = "4";
				break;
			}
			if (resp != "4" && resp != "3") {
				System.out.println("\n¿Desea realizar otra acción? (S/N)");
				resp = scr.nextLine();
				System.out.println();
			} else if (resp == "3") {
				resp = "s";
			} else if (resp == "4") {
				resp = "n";
			}
		} while (Verificador(resp, "s"));
	}

	static String menúFinal() {
		System.out.println("TALENTOS DIGITALES\n");
		System.out.println("(1) Ver empleados\n(2) Eliminar empleado\n(3) Agregar empleado\n(4) Salir\n");
		System.out.println("¿Qué acción desea realizar?");
		return scr.nextLine();
	}

	static void eliminarEmpleado() {
		System.out.println("*****************\n**  EMPLEADOS  **\n*****************\n");
		for (int i = 0; i < empleado.size(); i++) {
			System.out.println("(" + (i + 1) + ") " + empleado.get(i).getNombre());
		}
		if (aux == 0) {
			System.out.println("NO HAY EMPLEADOS INSCRITOS\n\n*****************");
		} else {
			System.out.println("\n*****************\nSeleccione un número para eliminar\n(0 para cancelar)");
			int eliminar;
			do {
				eliminar = Integer.parseInt(scr.nextLine());
				if (!((eliminar >= 0) && (eliminar <= aux)))
					System.out.println("Ha ingresado un número incorrecto, reintente:");
			} while (!((eliminar >= 0) && (eliminar <= aux)));
			if (eliminar != 0) {
			System.out.println("\nSe ha eliminado el empleado " + empleado.get(eliminar - 1).getNombre());
			empleado.remove(eliminar - 1);
			aux--;
			}
		}
	}
}
