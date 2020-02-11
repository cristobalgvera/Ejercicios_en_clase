package guía_5_E1;

import java.util.*;

public class Biblioteca {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sTitulo, sAutor;
		Integer iEjemplares, iPrestados;
		System.out.println("Ingrese el titulo del libro  ");
		sTitulo = sc.nextLine();
		System.out.println("Ingrese el autor del libro  ");
		sAutor = sc.nextLine();
		System.out.println(" la cantidad de libros que tenemos es ?  ");
		iEjemplares = sc.nextInt();
		System.out.println(" la cantidad de libros que tenemos  prestados es ?  ");
		iPrestados = sc.nextInt();
		Libro Libroconsulta = new Libro(sTitulo, sAutor, iEjemplares, iPrestados);
		System.out.println(Libroconsulta.toString());
	}
}