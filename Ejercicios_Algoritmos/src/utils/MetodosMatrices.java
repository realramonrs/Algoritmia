package utils;

import java.util.Random;

public class MetodosMatrices {

	public static void printArray(int m[]) {
		for(int valor : m) {
			System.out.print(valor + ", ");
		}
		System.out.println();
	}
	public static void llenarArray(int m[],int minimo,int maximo) {
		Random aleatorio = new Random();
		for(int i = 0;i<m.length;i++) {
			m[i] = aleatorio.nextInt(minimo,maximo + 1);
		}
	}
}
