package it.uniroma3.diadia.ambienti;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class Labirinto {
	
	private Stanza stanzaCorrente;
	private Stanza stanzaVincente;
	
	public void creaStanze() { // crea il labirinto, ovvero le stanze, gli attrezzi e i vari collegamenti
		
		/* creazione attrezzi */
		
		Attrezzo lanterna = new Attrezzo("lanterna", 3);
		Attrezzo osso = new Attrezzo("osso", 1);
				
		/* creazione stanze */
				
		Stanza atrio = new Stanza("Atrio");
		Stanza aulaN10 = new Stanza("N10");
		Stanza aulaN11 = new Stanza("N11");
		Stanza laboratorio = new Stanza("Laboratorio");
		Stanza biblioteca = new Stanza("Biblioteca");
		
		/* collegamenti stanze */
		
		atrio.impostaStanzaAdiacente("nord", biblioteca);
		atrio.impostaStanzaAdiacente("est", aulaN11);
		atrio.impostaStanzaAdiacente("sud", aulaN10);
		atrio.impostaStanzaAdiacente("ovest", laboratorio);
		aulaN11.impostaStanzaAdiacente("est", laboratorio);
		aulaN11.impostaStanzaAdiacente("ovest", atrio);
		aulaN10.impostaStanzaAdiacente("nord", atrio);
		aulaN10.impostaStanzaAdiacente("est", aulaN11);
		aulaN10.impostaStanzaAdiacente("ovest", laboratorio);
		laboratorio.impostaStanzaAdiacente("est", atrio);
		laboratorio.impostaStanzaAdiacente("ovest", aulaN11);
		biblioteca.impostaStanzaAdiacente("sud", atrio);
		
		/* posizionamento attrezzi nelle stanze */
		
		aulaN10.addAttrezzo(lanterna);
		atrio.addAttrezzo(osso);
		
	    /* Salvataggio stanza inizio gioco e stanza vincente */
		
		stanzaCorrente = atrio;
		stanzaVincente = biblioteca;
	 }
	
	
	
	public Stanza getStanzaVincente() { // ritorna la stanza vincente
		
		return stanzaVincente;
	}
	
	public void setStanzaCorrente(Stanza stanzaCorrente) { // cambia la stanza corrente
		
		this.stanzaCorrente = stanzaCorrente;
	}
	
	public Stanza getStanzaCorrente() { // ritorna la stanza corrente
		
		return this.stanzaCorrente;
	}

}