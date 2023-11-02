package metodosMatrices;

import java.util.Arrays;
import static utilidades.Consola.*;

public class Matrices {

	//Método que recibe un array y un valor a buscarmuestra por consola todas las posiciones en las que se encuentra
	
	public static void mostrarPosiciones(int numeros[],int numeroABuscar) {
		boolean encontrado = false;
		escribir("El " + numeroABuscar + " está en las posiciones: ");
		for(int i = 0;i<numeros.length;i++) {
			if(numeros[i] == numeroABuscar) {
				escribir(i);
				encontrado = true;
			}
		}
		if(!encontrado) {
			System.out.println("No está en la matriz.");
		}
	}
	
	//Método que busca un elemento en un array
	public static boolean buscarValor(int[] numeros, int numeroABuscar) {
		for(int n : numeros) {
			if(n == numeroABuscar) {
				return true;
			}
		}
		return false;
	}
	
	//Método que recibe un array y un número opcional de velores y devuelve la primera aparición de ellos
	
	public static int buscarPrimeraOcurrencia(int m[], int...n) {
		for(int i = 0;i<m.length;i++) {
			for(int valor : n) {
				if(valor == m[i]) {
					return i;
				}
			}
		}
		return -1;
	}
}
