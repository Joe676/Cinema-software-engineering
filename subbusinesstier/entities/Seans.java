package subbusinesstier.entities;

import java.util.*;

public class Seans {

	private Collection<Miejsce> miejsca = new ArrayList<>();
	private String film;
	private String data;

	public Seans() {
		// TODO - implement Seans.Seans
		throw new UnsupportedOperationException();
	}

	public List<Miejsce> getMiejsca() {
		// TODO - implement Seans.getMiejsca
		throw new UnsupportedOperationException();
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
		// TODO - implement Seans.setMiejsca
		throw new UnsupportedOperationException();
	}
	
	public void setMiejsca(String[] miejsca) {
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
		// TODO - implement Seans.setData
		throw new UnsupportedOperationException();
	}
	
	public boolean equals(Object obj) {
		// TODO - implement Seans.setData
		if(!(obj instanceof Seans)) return false;
		Seans seans = (Seans)obj;
		if(seans.getData()==this.getData() && seans.getFilm()==this.getFilm() && seans.getMiejsca()==this.getMiejsca()) return true;
		else return false;
		//throw new UnsupportedOperationException();
	}

}