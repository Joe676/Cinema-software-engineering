package subbusinesstier.entities;

public class Miejsce {

	private int sala;
	private int rzad;
	private int nr;
	private boolean czyWolne;

	public Miejsce() {
		// TODO - implement Miejsce.Miejsce
		throw new UnsupportedOperationException();
	}

	public int getSala() {
		return this.sala;
	}

	public int getRzad() {
		return this.rzad;
	}

	public int getNR() {
		// TODO - implement Miejsce.getNR
		throw new UnsupportedOperationException();
	}

	public boolean getCzyWolne() {
		return this.czyWolne;
	}

	/**
	 * 
	 * @param sala
	 */
	public void setSala(int sala) {
		this.sala = sala;
	}

	/**
	 * 
	 * @param rzad
	 */
	public void setRzad(int rzad) {
		this.rzad = rzad;
	}

	/**
	 * 
	 * @param czyWolne
	 */
	public void setCzyWolne(boolean czyWolne) {
		this.czyWolne = czyWolne;
	}

}