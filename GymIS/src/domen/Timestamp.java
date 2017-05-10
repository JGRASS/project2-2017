package domen;

import java.sql.Date;
import java.sql.Time;

public class Timestamp {
	private int id;
	private Date date;
	private Time time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Date: " + getDate() + " Time: " + getTime();
	}

}
