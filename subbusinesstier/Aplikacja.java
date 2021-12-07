package subbusinesstier;

import java.util.*;
import subbusinesstier.entities.*;

public class Aplikacja {

	private List<Seans> repertuar = new ArrayList<>();
	private List<Rezerwacja> rezerwacje = new ArrayList<>();
	private List<Pracownik> pracownicy = new ArrayList<>();
	private List<Klient> klienci = new ArrayList<>();
	private int uprawnienia = 0;
	
	Scanner scan = new Scanner(System.in);

	public Aplikacja() {
		// TODO - implement Aplikacja.Aplikacja
		throw new UnsupportedOperationException();
	}

	public List<Rezerwacja> getRezerwacje() {
		return rezerwacje;
	}

	public List<Seans> getRepertuar() {
		return repertuar;
	}

	public List<Pracownik> getPracowmicy() {
		return pracownicy;
	}

	public List<Klient> getKlienci() {
		return klienci;
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
		s.setMiejsca(dane[2]);
		for(Seans seans : repertuar) {
			if(s.equals(seans)) return s;			
		}
		return null;
	}
	
	/**
	 * 
	 * @param seans
	 */
	public void modyfikujSeans() {
		int operacja = 0;
		String[] dane = {};
		System.out.println("1 - Usun seans");
		System.out.println("2 - Modyfikuj seans");
		System.out.println("3 - Dodaj seans");
		System.out.println("Podaj nr operacji: ");
		operacja = scan.nextInt();
		if(operacja == 1) {
			String info;
			System.out.println("Podaj tytu³ filmu");
			info = scan.nextLine();
			dane[0] = info;
			System.out.println("Podaj datê filmu");
			info = scan.nextLine();
			dane[1] = info;
			if(wyszukajSeans(dane)!=null) {
				usunSeans(dane);
			}
			else System.out.println("Niepoprawne dane seansu");
		}
		else if(operacja == 2) {
			String info;
			System.out.println("Podaj tytu³ filmu");
			info = scan.nextLine();
			dane[0] = info;
			System.out.println("Podaj datê filmu");
			info = scan.nextLine();
			dane[1] = info;
			if(wyszukajSeans(dane)!=null) {
				modyfikujDaneSeansu(dane);
			}
			else System.out.println("Niepoprawne dane seansu");
		}
		else if(operacja == 3) {
			String info;
			System.out.println("Podaj tytu³ filmu");
			info = scan.nextLine();
			dane[0] = info;
			System.out.println("Podaj datê filmu");
			info = scan.nextLine();
			dane[1] = info;
			dodajSeans(dane);
		}
		else System.out.println("Nieprawid³owy numer operacji");
	}
	
	public void modyfikujDaneSeansu(String[] dane) {
		Seans seans = wyszukajSeans(dane);
		String info;
		String[] data;
		System.out.println("Podaj nowy tytu³ filmu");
		info = scan.nextLine();
		dane[0] = info;
		System.out.println("Podaj now¹ datê filmu");
		info = scan.nextLine();
		dane[1] = info;
		seans.setFilm(dane[0]);
		seans.setData(dane[1]);
	}

	/**
	 * 
	 * @param seans
	 */
	public void usunSeans(String[] dane) {
		Seans seans = wyszukajSeans(dane);
		if(seans==null) {
			System.out.println("Nie mozna usunac seansu, nie znaleziono go w repertuarze");
			return;
		}
		else {
			repertuar.remove(seans);
			System.out.println("Seans pomyœlnie usuniêty");
		}
	}

	public void zaloguj() {
		System.out.println("Podaj login:");
		String login = scan.nextLine();
		for(Pracownik p : pracownicy) {
			if(p.getLogin().equals(login)) {
				System.out.println("Podaj haslo: ");
				String haslo = scan.nextLine();
				if(p.getHaslo().equals(haslo)){
					uprawnienia = 1;
					System.out.println("Zalogowano pomyœlmnie");
				}
				else System.out.println("Nieprawid³owe has³o");
			}
			else System.out.println("Nieprawid³owy login");
		}
	}

	public void wyloguj() {
		if(uprawnienia==1) {
			uprawnienia = 0;
			System.out.println("Wylogowano pomyœlnie");
		}
		else System.out.println("Nie ma potrzeby wylogowania");
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