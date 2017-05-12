package domen;

/**
 * Klasa koja sadrzi podatke o radniku. Odgovara arhitekturi baze.
 * 
 * @author Miljan Ignjatovic
 * @version 1.0
 *
 */
public class GymWorker {
	/**
	 * Jedinstveni identifikator radnika.
	 */
	private int id;
	/**
	 * Korisnicko ime radnika. Koristi se pri prijavljivanju radnika na sistem.
	 */
	private String username;
	/**
	 * Sifra radnika za prijavljivanje radnika na sistem.
	 */
	private String password;

	/**
	 * Kompletan konstruktor za instancu klaze GymWorker.
	 * 
	 * @param id
	 *            - Jedinstveni identifikator radnika kao int.
	 * @param username
	 *            - Korisnicko ime radnika kao String.
	 * @param password
	 *            - Sifra radnika kao String.
	 */
	public GymWorker(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	/**
	 * Prazan konstruktor za instancu klaze GymWorker.
	 */
	public GymWorker() {
	}

	/**
	 * Get metoda za atribut id.
	 * 
	 * @return id - Jedinstveni identifikator radnika kao int.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set metoda za atribut id.
	 * 
	 * @param id
	 *            - Jedinstveni identifikator radnika kao int.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Get metoda za atribut username.
	 * 
	 * @return username - Korisnicko ime radnika. kao String
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set metoda za atribut Username.
	 * 
	 * @param Username
	 *            - Korisnicko ime radnika kao String.
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Set metoda za atribut Password.
	 * 
	 * @return password - Sifra radnika. kao String
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set metoda za atribut Password.
	 * 
	 * @param Password
	 *            - Sifra radnika kao String.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * toString metoda za klasu GymWorker.
	 */
	@Override
	public String toString() {
		return "ID: " + getId() + " Username: " + getUsername() + " Password: " + getPassword();
	}

}
