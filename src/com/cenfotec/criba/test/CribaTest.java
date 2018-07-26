package com.cenfotec.criba.test;


import static org.junit.Assert.*;

import org.junit.*;

import com.cenfotec.criba.CribaEratostenes;

public class CribaTest {

	public static CribaEratostenes criba;
	public static int [] primosCriba;
	
	@BeforeClass
	public static void init() {
		criba = new CribaEratostenes();
		
	}
	
	@Test
	public void primosHasta10() {
		primosCriba = criba.generaCriba(10);
	
		assertEquals(2, primosCriba[0]);
		assertEquals(3, primosCriba[1]);
		assertEquals(5, primosCriba[2]);
		assertEquals(7, primosCriba[3]);
	}
	
	@Test
	public void primosHassta100() {
		primosCriba = criba.generaCriba(100);
		
		assertEquals(25, primosCriba.length);
	}
	
	@Test
	public void primosHassta1000() {
		primosCriba = criba.generaCriba(1000);
		
		assertEquals(168, primosCriba.length);
	}
	
	@Test(expected=NullPointerException.class)
	public void enviarNumeroMenor2() {
		
		primosCriba = criba.generaCriba(1);
		
		assertEquals(1, primosCriba[0]);
	}

}
