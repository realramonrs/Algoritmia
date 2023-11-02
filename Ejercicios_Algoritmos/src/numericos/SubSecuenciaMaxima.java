package numericos;

import java.util.Random;


import static utils.MetodosMatrices.*;


public class SubSecuenciaMaxima {

public static int subsecMax(int m[]) {
		
		int suma = 0;
		int inicio = 0;
		int end = inicio;
		int sumaMax = 0;
		
	for(int i = 0;i<m.length;i++) {
		for(int j = 0;j<m.length;j++) {
			System.out.println("j: " + j);
			for(int k = inicio;k<end&&end<m.length;k++) {
				suma = suma + m[k];
				System.out.print(k + " + ");
				if(suma > sumaMax) {
					sumaMax = suma;
				}
			} //Cierr del k
			System.out.println();
			suma = 0;
			end++;
		}//Cierre for j
		inicio++;
	}
		
		
		return sumaMax;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m[] = new int[5];
		
	    llenarArray(m, -10, 10);
		
		printArray(m);
		
		System.out.println(subsecMax(m));
		
		

	}

}
