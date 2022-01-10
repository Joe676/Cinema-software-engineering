package subbusinesstier.entities;

import java.util.*;

public class Seans {

	private List<Miejsce> miejsca = new ArrayList<>();
	private String film;
	private String data;

	public Seans(String _film, String _data, List<Miejsce> _miejsca) {
		setFilm(_film);
                setData(_data);
                setMiejsca(_miejsca);
	}

	public List<Miejsce> getMiejsca() {
		return this.miejsca;
	}

	public List<Miejsce> getWolneMiejsca() {
		// TODO - implement Seans.getWolneMiejsca
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param miejsca
	 */
	public void setMiejsca(List<Miejsce> miejsca) {
            this.miejsca = miejsca;
        }
	
	public void setMiejsca(String miejsca) {
		// TODO - implement Seans.setMiejsca
		throw new UnsupportedOperationException();
	}

	public String getFilm() {
		return this.film;
	}

	public String getData() {
		return this.data;
	}

	/**
	 * 
	 * @param film
	 */
	public void setFilm(String film) {
		this.film = film;
	}

	/**
	 * 
	 * @param data
	 */
	public void setData(String data) {
		this.data = data;
	}
	
        @Override
	public boolean equals(Object obj) {
		// TODO - implement Seans.setData
		if(!(obj instanceof Seans)) return false;
		Seans seans = (Seans)obj;
		if(seans.getData()==this.getData() && seans.getFilm()==this.getFilm()) return true;
		else return false;
	}
        
        public String toString(){
            return film + " - " + data;
        }
        
}