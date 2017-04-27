package domen;

import java.util.GregorianCalendar;

public class Timestamp {
	private int id;
	private GregorianCalendar timestamp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public GregorianCalendar getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(GregorianCalendar timestamp) {
		this.timestamp = timestamp;
	}

}
