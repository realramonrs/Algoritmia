package utilidades;

import java.util.Scanner;

public class Consola {

	// Método que solicita al usuario que introduzca un entero por consola
	public static int leerInt() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca un entero: ");
		int valor = lector.nextInt();
		lector.close();
		return valor;
	}

	public static String leerString() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca un entero: ");
		String valor = lector.nextLine();
		lector.close();
		return valor;
	}

	// Método que printa por consola un mensaje

	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static void escribir(int numero) {
		System.out.print(numero + " ");
	}
	
	public static void escribir() {
		System.out.println();
	}

	// Método que escribe un array de enteros por consola

	public static void escribir(int m[]) {
		for (int valor : m) {

			System.out.print(valor + " ");

		}
		escribir();
	}

}
