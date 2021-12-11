package subbusinesstier.entities;

import java.util.*;

public class Rezerwacja {
        
        private String nrRezerwacji;
	private Seans seans;
	private Collection<Miejsce> miejsca = new ArrayList<>();
	private Klient klient;

	public Rezerwacja() {
		// TODO - implement Rezerwacja.Rezerwacja
		throw new UnsupportedOperationException();
	}
        
        public String getNr(){
            return nrRezerwacji;
        }
        
        public void setNr(String nr){
            nrRezerwacji = nr;
        }
        
	public Seans getSeans() {
		return this.seans;
	}

	/**
	 * 
	 * @param seans
	 */
	public void setSeans(Seans seans) {
		this.seans = seans;
	}

	public Klient getKlient() {
		// TODO - implement Rezerwacja.getKlient
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param klient
	 */
	public void setKlient(Klient klient) {
		// TODO - implement Rezerwacja.setKlient
		throw new UnsupportedOperationException();
	}

	public List<Miejsce> getMiejsca() {
		// TODO - implement Rezerwacja.getMiejsca
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param miejsca
	 */
	public void setMiejsca(List<Miejsce> miejsca) {
		// TODO - implement Rezerwacja.setMiejsca
		throw new UnsupportedOperationException();
	}

}