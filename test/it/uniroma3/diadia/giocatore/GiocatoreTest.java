package it.uniroma3.diadia.giocatore;
import static org.junit.Assert.*;

import org.junit.Test;

import it.uniroma3.diadia.giocatore.Giocatore;

public class GiocatoreTest {
	
	Giocatore g = new Giocatore();
	
	@Test
	public void testGetCfuDefault() {
		
		assertEquals(20, g.getCfu());
	}
	
	@Test
	public void testGetBorsaDefault() {
		
		assertNotNull(g.getBorsa());
	}
	
	@Test
	public void testSetCfu() {
		
		g.setCfu(10);
		assertEquals(10, g.getCfu());
	}
	
}
