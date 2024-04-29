package it.uniroma3.diadia.ambienti;
import static org.junit.Assert.*;

import org.junit.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaTest {
	
	private Stanza n10 = new Stanza("N10");
	private Stanza n11 = new Stanza("N11");
	private Attrezzo c = new Attrezzo("coltello", 1);
	
	@Test
	public void testAddAttrezzo() {
		
		assertTrue(n11.addAttrezzo(c));
	}
	
	@Test
	public void testGetStanzaAdiacente() {
		
		assertNull(n11.getStanzaAdiacente("nord"));
	}
	
	@Test
	public void testImpostaStanzaAdiacente() {
		
		n11.impostaStanzaAdiacente("sud", n10);
		assertEquals(n10, n11.getStanzaAdiacente("sud"));
	}
	
	@Test
	public void testGetNome() {
		
		assertEquals("N11", n11.getNome());
	}
	
}
