package subbusinesstier.entities;

public abstract class Uzytkownik {

	private String imie;
	private String nazwisko;
	private String email;
	private int telefon;

	public Uzytkownik() {
		// TODO - implement Uzytkownik.Uzytkownik
		throw new UnsupportedOperationException();
	}

	public String getImie() {
		return this.imie;
	}

	/**
	 * 
	 * @param imie
	 */
	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	/**
	 * 
	 * @param nazwisko
	 */
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefon() {
		return this.telefon;
	}

	/**
	 * 
	 * @param telefon
	 */
	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

}