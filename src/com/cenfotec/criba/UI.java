package com.cenfotec.criba;

import com.cenfotec.criba.CribaEratostenes;

public class UI {

	public static void main(String[] args) {
		//CribaEratostenes criba = new CribaEratostenes();

		int primos[] = CribaEratostenes.generaCriba(10);
		
		System.out.println("Primos tamanno ===> :" + primos.length );
		System.out.println();
		
		for( int i = 0; i < primos.length; i++) {
			System.out.println("Primo: " + primos[i]);
		}
		
		
	}

}
