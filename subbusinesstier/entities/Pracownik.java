package subbusinesstier.entities;

public class Pracownik extends Uzytkownik {

	private String login;
	private String haslo;

	public Pracownik() {
		// TODO - implement Pracownik.Pracownik
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param login
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogin() {
		return this.login;
	}

	/**
	 * 
	 * @param haslo
	 */
	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}

	public String getHaslo() {
		return this.haslo;
	}

}