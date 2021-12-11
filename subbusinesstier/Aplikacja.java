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
                Fabryka fabryka = new Fabryka();
		Seans s = fabryka.stworzSeans(dane);
//		s.setData(dane[0]);
//		s.setFilm(dane[1]);
//		s.setMiejsca(dane[2]);
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
                switch(operacja){
                    case 1:
                    {
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
                    break;
                    case 2:
                    {
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
                    break;
                    case 3:
                    {
			String info;
			System.out.println("Podaj tytu³ filmu");
			info = scan.nextLine();
			dane[0] = info;
			System.out.println("Podaj datê filmu");
			info = scan.nextLine();
			dane[1] = info;
			dodajSeans(dane);
                    }
                    break;
                    
                    default:
                        System.out.println("Nieprawid³owy numer operacji");
                        
                }
//		if(operacja == 1) {
//			String info;
//			System.out.println("Podaj tytu³ filmu");
//			info = scan.nextLine();
//			dane[0] = info;
//			System.out.println("Podaj datê filmu");
//			info = scan.nextLine();
//			dane[1] = info;
//			if(wyszukajSeans(dane)!=null) {
//				usunSeans(dane);
//			}
//			else System.out.println("Niepoprawne dane seansu");
//		}
//		else if(operacja == 2) {
//			String info;
//			System.out.println("Podaj tytu³ filmu");
//			info = scan.nextLine();
//			dane[0] = info;
//			System.out.println("Podaj datê filmu");
//			info = scan.nextLine();
//			dane[1] = info;
//			if(wyszukajSeans(dane)!=null) {
//				modyfikujDaneSeansu(dane);
//			}
//			else System.out.println("Niepoprawne dane seansu");
//		}
//		else if(operacja == 3) {
//			String info;
//			System.out.println("Podaj tytu³ filmu");
//			info = scan.nextLine();
//			dane[0] = info;
//			System.out.println("Podaj datê filmu");
//			info = scan.nextLine();
//			dane[1] = info;
//			dodajSeans(dane);
//		}
//		else System.out.println("Nieprawid³owy numer operacji");
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
                rezerwacje.add(rezerwacja);
	}

	/**
	 * 
	 * @param rezerwacja
	 */
	public void usunRezerwacje(Rezerwacja rezerwacja) {
                if(rezerwacje.contains(rezerwacja)){
                    rezerwacje.remove(rezerwacja);
                }
	}

        public void usunRezerwacje(int idx) {
                if(idx != -1){
                    rezerwacje.remove(idx);
                }
	}
        
	/**
	 * 
	 * @param rezerwacja
	 */
	public void modyfikujRezerwacje(Rezerwacja rezerwacja) {
		throw new UnsupportedOperationException();
	}
        
        public void zarzadzajRezerwacjami(){
            int operacja;
            String[] dane = {};
            System.out.println("1 - Usun rezerwacje");
            System.out.println("2 - Modyfikuj rezerwacje");
            System.out.println("3 - Rezerwuj miejsce");
            System.out.println("Podaj nr operacji: ");
            operacja = scan.nextInt();
            
            switch(operacja){
                    case 1:
                    {
                        String info;
			System.out.println("Podaj numer rezerwacji");
			info = scan.nextLine();
			dane[0] = info;
			if(wyszukajRezerwacje(dane[0])!=-1) {
                            usunRezerwacje(Integer.valueOf(dane[0]));
			}
			else System.out.println("Niepoprawny numer");
                    }
                    break;
                    case 2:
                    {
                    }
                    break;
                    case 3:
                    {
                        rezerwujMiejsca();
                    }
                    break;
                    
                    default:
                        System.out.println("Nieprawid³owy numer operacji");
                        
                }
        }

	/**
	 * 
	 * @param rezerwacja
     * @return indeks szukanej rezerwacji
	 */
	public int wyszukajRezerwacje(Rezerwacja rezerwacja) {
                return rezerwacje.indexOf(rezerwacja);
	}
        
        public int wyszukajRezerwacje(String numerRezerwacji){
            for(int i = 0; i < rezerwacje.size(); i++){
                if(rezerwacje.get(i).getNr().equals(numerRezerwacji)) return i;
            }
            return -1;
        }

    private void rezerwujMiejsca() {
        for(int i = 0; i < repertuar.size(); i++){
            System.out.println(i + ".: " + repertuar.get(i).toString());
        }
        System.out.println("Podaj numer filmu");
        int filmIdx = scan.nextInt();
        List<Miejsce> wolneMiejsca = repertuar.get(filmIdx).getWolneMiejsca();
        if(wolneMiejsca.isEmpty()){
            System.out.println("Nie ma wolnych miejsc na wybrany seans.");
            return;
        }
        System.out.println("Podaj liczbê rezerwowanych miejsc.");
        int liczbaMiejsc = scan.nextInt();
        if(wolneMiejsca.size() < liczbaMiejsc){
            System.out.println("Na ten seans nie ma wystarczaj¹co wolnych miejsc");
            return;
        }
        System.out.println("Lista wolnych miejsc: ");
        for(int i = 0; i < wolneMiejsca.size(); i++){
            System.out.println(i + ".: " + wolneMiejsca.get(i).toString());
        }
        
        System.out.println("Podaj wybrane numery miejsc");
        
        int[] miejsca = new int[liczbaMiejsc];
        for(int i = 0; i < liczbaMiejsc; i++){
            miejsca[i] = scan.nextInt();
        }
        
        System.out.println("Podaj id klienta");
        int idKlienta = scan.nextInt();
        if(wyszukajKlienta(idKlienta) == -1){
            System.out.println("Nie znaleziono klienta");
            return;
        }
        String[] dane = new String[3];
        dane[0] = Integer.toString(filmIdx);
        String miejscaString = "";
        for(int i = 0; i < liczbaMiejsc; i++){
            miejscaString += miejsca[i] + "|";
        }
        dane[1] = miejscaString;
        dane[2] = Integer.toString(idKlienta);
        Fabryka fabryka = new Fabryka();
        Rezerwacja r = fabryka.stworzRezerwacje(dane);
        dodajRezerwacje(r);
        System.out.println("Numer Rezerwacji: " + r.getNr());
    }
    
    public int wyszukajKlienta(int id){
        for(int i = 0; i < klienci.size(); i++){
            if(klienci.get(i).getId() == id)return i; 
        }
        return -1;
    }

}