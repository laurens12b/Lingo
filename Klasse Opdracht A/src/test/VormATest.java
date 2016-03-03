package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import vormenA.*;

public class VormATest {
	
	Vorm vierkant;
	Vorm cirkel;
	Vorm rechthoek;

	@Before
	public void setUp() throws Exception {
		vierkant = new Vierkant(5);
		cirkel = new Cirkel(2);
		rechthoek = new Rechthoek(10, 15);
	}

	@Test
	public void cirkelTest() {
		assertEquals(cirkel.toString(), "De omtrek is: " + 2 * Math.PI * 2);
		cirkel = new Cirkel(3);
		assertEquals(cirkel.toString(), "De omtrek is: " + 3 * Math.PI * 2);
	}
	
	@Test
	public void vierkantTest() {
		assertEquals(vierkant.toString(), "De omtrek is: 20.0");
	}
	
	@Test
	public void rechthoekTest() {
		assertEquals(rechthoek.toString(), "De omtrek is: 50.0");
	}
	

}
