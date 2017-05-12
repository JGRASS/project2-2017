package domen;

import java.sql.Date;
import java.sql.Time;

/**
 * Klasa koja sadrzi podatke o dolasku clana. Koristi se pri evidenciji dolaska.
 * Odgovara arhitekturi baze.
 * 
 * @author Miljan Ignjatovic
 * @version 1.0
 *
 */
public class Timestamp {
	/**
	 * Jedinstveni identifikator claa.
	 */
	private int id;
	/**
	 * Datum evidencije.
	 */
	private Date date;
	/**
	 * Vreme evidencije.
	 */
	private Time time;

	/**
	 * Get metoda za atribut id.
	 * 
	 * @return id - Jedinstveni identifikator clana kao int.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set metoda za atribut id.
	 * 
	 * @param id
	 *            - Jedinstveni identifikator clana kao int.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Get metoda za tribut Date.
	 * 
	 * @return date - Datum evidencije. @see java.sql.Date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Set metoda za atribut Date.
	 * 
	 * @param date
	 *            - Datum evidencije. @see java.sql.Date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Get metoda za atribut Time.
	 * 
	 * @return time - Vreme evidencije. @see java.sql.Time
	 */
	public Time getTime() {
		return time;
	}

	/**
	 * Set metoda za atribut Time.
	 * 
	 * @param time
	 *            - Vreme evidencije. @see java.sql.Time
	 */
	public void setTime(Time time) {
		this.time = time;
	}

	/**
	 * toString metoda za klasu Timestamp.
	 */
	@Override
	public String toString() {
		return "Date: " + getDate() + " Time: " + getTime();
	}

}
