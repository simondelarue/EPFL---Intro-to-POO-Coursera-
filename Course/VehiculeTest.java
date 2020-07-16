package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Vehicule;

public class VehiculeTest {

	@Test
	public void testMeilleur() {
		Vehicule v1 = new Vehicule();
		Vehicule v2 = new Vehicule("Ferrari", 300, 500, 0);
		boolean meilleur = v2.meilleur(v1);
		assertEquals(true, meilleur);
	}

}
