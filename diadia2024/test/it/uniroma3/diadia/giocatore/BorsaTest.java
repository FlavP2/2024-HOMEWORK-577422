package it.uniroma3.diadia.giocatore;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

public class BorsaTest {

	Borsa b = new Borsa();
	Attrezzo coltello;
	Attrezzo spadone;
	
	@Before
	public void setUp() {
		
		coltello = new Attrezzo("coltello", 1);
		spadone = new Attrezzo("spadone", 11);
	}
	
	@Test
	public void testGetPesoMax() {
		
		assertEquals(10, b.getPesoMax());
	}
	
	@Test
	public void isEmpty() {
		
		assertTrue(b.isEmpty());
	}
	
	@Test
	public void testHasAttrezzo() {
		
		b.addAttrezzo(coltello);
		assertTrue(b.hasAttrezzo("coltello"));
	}
	
	@Test
	public void testRemoveAttrezzo() {
		
		b.addAttrezzo(coltello);
		b.removeAttrezzo("coltello");
		assertFalse(b.hasAttrezzo("coltello"));
		
	}

	@Test
	public void testAddAttrezzoPesoMinoreDiDieci() {
		
		assertTrue(b.addAttrezzo(coltello));
	}
	
	@Test
	public void testAddAttrezzoPesoMaggioreDiDieci() {
		
		assertFalse(b.addAttrezzo(spadone));
	}
	
	@Test
	public void testGetAttrezzo() {
		
		b.addAttrezzo(coltello);
		assertEquals(coltello, b.getAttrezzo("coltello"));
	}
	
	@Test
	public void testGetPeso() {
		
		b.addAttrezzo(coltello);
		assertEquals(1, b.getAttrezzo("coltello").getPeso());
	}
	
}