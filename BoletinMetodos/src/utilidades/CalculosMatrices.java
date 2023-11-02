package utilidades;

import java.util.Random;

public class CalculosMatrices {

	// Método que llena un array de enteros
	public static void llenarMatriz(int[] m, int min, int max) {

		Random aleatorio = new Random();
				for (int i = 0; i < m.length; i++) {
				m[i] = aleatorio.nextInt(min,max);
			}
		}  //Fin del método llenarMatriz
	
	
	//Método que calcula la suma
	public static int sumaMatriz(int m[]) {
		int suma = 0;
		
		for(int valor : m) {
			suma = suma + valor;
		}
		return suma;
	}
	
	//Método que calcula la media
	
	public static double mediaMatriz(int m[]) {
		double media = 0;
		
		int suma = sumaMatriz(m);
		media = suma/m.length;
		return media;
	}
	
}
