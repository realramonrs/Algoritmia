package metodosMatrices;
import static utilidades.CalculosMatrices.*;
import static utilidades.Consola.*;

import java.util.Arrays;

public class TestMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m[] = new int[50];
		
		llenarMatriz(m, 0, 20);
		
		//Posiciones en las que hay un cero
		Matrices.mostrarPosiciones(m, 0);
		escribir();
		boolean encontrado = Matrices.buscarValor(m, 0);
		
	
	
		
		
		//Buscamos si está el 0, o el 1 y la primera vez que aparecen
		int primeraOcurrencia = Matrices.buscarPrimeraOcurrencia(m, 67,99);
		
	//	escribir(m);
		System.out.println("Primera ocurrencia: " + primeraOcurrencia);
	}

}
