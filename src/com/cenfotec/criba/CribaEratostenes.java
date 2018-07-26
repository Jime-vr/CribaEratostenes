package com.cenfotec.criba;

public class CribaEratostenes {
	
	public static int i, j;
	
	public static int[] generaCriba(int tope) {
		
		if (tope >= 2) {
			
			int dim = tope + 1;
			boolean[] primo = new boolean[dim];

			seleccionPrimos(dim, primo);

			return contarYObtenerValorPrimos(dim, primo);
			
		} else {
			return new int [0];
		}

	}
	
	private static void seleccionPrimos(int dim, boolean[] primo) {
		for (i = 0; i < dim; i++) {
			primo[i] = true;
		}

		primo[0] = primo[1] = false;
		
		for (i = 2; i < Math.sqrt(dim) + 1; i++) {

			if (primo[i]) {

				for (j = 2 * i; j < dim; j += i) {
					primo[j] = false;
				}
			}
		}
	}

	private static int[] contarYObtenerValorPrimos(int dim, boolean[] primo) {
		int cuenta = contarPrimos(dim, primo);
		
		int[] primos = new int[cuenta];
		for (i = 0, j = 0; i < dim; i++) {
			if (primo[i]) {
			
				primos[j++] = i;
			}
		}

		return primos;
	}

	private static int contarPrimos(int dim, boolean[] primo) {
		int cuenta = 0;

		for (i = 0; i < dim; i++) {

			if (primo[i]) {

				cuenta++;
			}
		}
		return cuenta;
	}
}
