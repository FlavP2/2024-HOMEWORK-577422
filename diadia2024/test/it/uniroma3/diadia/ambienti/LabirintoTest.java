package it.uniroma3.diadia.ambienti;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;

public class LabirintoTest {
	
	Labirinto l;
	Stanza biblioteca;
	Stanza N11;

	@Before
	public void setUp() {
		
		l = new Labirinto();
		l.creaStanze();
		biblioteca = new Stanza("Biblioteca");
		N11 = new Stanza("N11");
	}

	@Test
	public void testSetStanzaCorrente() {
		
		l.setStanzaCorrente(N11);
		assertEquals(N11, l.getStanzaCorrente());
	}
	
	@Test
	public void testGetStanzaCorrente() {
		
		assertEquals("Atrio", l.getStanzaCorrente().getNome());
	}
	
	@Test
	public void testGetStanzaVincente() {
		
		assertEquals("Biblioteca", l.getStanzaVincente().getNome());
	}

}