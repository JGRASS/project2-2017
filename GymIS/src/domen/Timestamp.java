package domen;

import java.sql.Date;

public class Timestamp {
	private int id;
	private Date timestamp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	@Override
	public String toString() {
		return "ID: " + getId() + " Timestamp: " + getTimestamp();
	}

}
