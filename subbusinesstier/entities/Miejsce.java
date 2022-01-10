package subbusinesstier.entities;

public class Miejsce {

	private int sala;
	private int rzad;
	private int nr;
	private boolean czyWolne;

	public Miejsce(int _sala, int _rzad, int _nr) {
		sala = _sala;
                rzad = _rzad;
                nr = _nr;
                czyWolne = true;
	}

	public int getSala() {
		return this.sala;
	}

	public int getRzad() {
		return this.rzad;
	}

	public int getNR() {
		return nr;
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
        
        public String toString(){
		throw new UnsupportedOperationException();
        }
        
        @Override
	public boolean equals(Object obj) {
            if(!(obj instanceof Miejsce)) return false;
            Miejsce miejsce = (Miejsce)obj;
            return sala == miejsce.getSala() && nr == miejsce.getNR() && rzad == miejsce.getRzad();
        }
}