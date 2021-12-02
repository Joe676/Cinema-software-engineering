package subbusinesstier;

import java.util.*;
import subbusinesstier.entities.*;

public class Aplikacja {

	private List<Seans> repertuar = new ArrayList<>();
	private List<Rezerwacja> rezerwacje = new ArrayList<>();
	private List<Pracownik> pracownicy = new ArrayList<>();
	private List<Klient> klienci = new ArrayList<>();
	private int uprawnienia;

	public Aplikacja() {
		// TODO - implement Aplikacja.Aplikacja
		throw new UnsupportedOperationException();
	}

	public List<Rezerwacja> getRezerwacje() {
		// TODO - implement Aplikacja.getRezerwacje
		throw new UnsupportedOperationException();
	}

	public List<Seans> getRepertuar() {
		// TODO - implement Aplikacja.getRepertuar
		throw new UnsupportedOperationException();
	}

	public List<Pracownik> getPracowmicy() {
		// TODO - implement Aplikacja.getPracowmicy
		throw new UnsupportedOperationException();
	}

	public List<Klient> getKlienci() {
		// TODO - implement Aplikacja.getKlienci
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param seans
	 */
	public void dodajSeans(String[] data) {
		// TODO - implement Aplikacja.dodajSeans
		if(wyszukajSeans(data)!=null) {
			System.out.println("Nie mozna dodac seansu ponownie");
		}
		else {
			Fabryka f = new Fabryka();
			Seans seans = f.stworzSeans(data);
			repertuar.add(seans);
			System.out.println("Seans dodany pomyslnie");
		}
		//throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param seans
	 */
	public Seans wyszukajSeans(Seans seans) {
		// TODO - implement Aplikacja.wyszukajSeans
		for(Seans s : repertuar) {
			if(s.equals(seans)) 
				return s;			
		}
		return null;
		//throw new UnsupportedOperationException();
	}
	
	public Seans wyszukajSeans(String[] dane) {
		Seans s = new Seans();
		s.setData(dane[0]);
		s.setFilm(dane[1]);
		//s.setMiejsca(dane[2]);
		for(Seans seans : repertuar) {
			if(s.equals(seans)) return s;			
		}
		return null;
	}
	
	/**
	 * 
	 * @param seans
	 */
	public void modyfikujSeans(String[] dane, int operacja) {
		// TODO - implement Aplikacja.modyfikujSeans
		if(operacja == 1) usunSeans(dane);
		else if(operacja == 2) modyfikujDaneSeansu(dane);
		else if(operacja == 3) dodajSeans(dane);
		//throw new UnsupportedOperationException();
	}
	
	public void modyfikujDaneSeansu(String[] dane) {
		
	}

	/**
	 * 
	 * @param seans
	 */
	public void usunSeans(String[] dane) {
		// TODO - implement Aplikacja.usunSeans
		Seans seans = wyszukajSeans(dane);
		if(seans==null) {
			System.out.println("Nie mozna usunac seansu, nie znaleziono go w repertuarze");
			return;
		}
		else {
			repertuar.remove(seans);
		}
		//throw new UnsupportedOperationException();
	}

	public void zaloguj() {
		// TODO - implement Aplikacja.zaloguj
		throw new UnsupportedOperationException();
	}

	public void wyloguj() {
		// TODO - implement Aplikacja.wyloguj
		throw new UnsupportedOperationException();
	}

	public static void main(String[] args) {
		// TODO - implement Aplikacja.main
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param rezerwacja
	 */
	public void dodajRezerwacje(Rezerwacja rezerwacja) {
		// TODO - implement Aplikacja.dodajRezerwacje
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param rezerwacja
	 */
	public void usunRezerwacje(Rezerwacja rezerwacja) {
		// TODO - implement Aplikacja.usunRezerwacje
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param rezerwacja
	 */
	public void modyfikujRezerwacje(Rezerwacja rezerwacja) {
		// TODO - implement Aplikacja.modyfikujRezerwacje
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param rezerwacja
	 */
	public int wyszukajRezerwacje(Rezerwacja rezerwacja) {
		// TODO - implement Aplikacja.wyszukajRezerwacje
		throw new UnsupportedOperationException();
	}

}