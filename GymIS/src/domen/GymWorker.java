package domen;

public class GymWorker {

	private int id;
	private String username;
	private String password;
	
	public GymWorker(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	public GymWorker() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ID: " + getId() + " Username: " + getUsername() + " Password: " + getPassword();
	}


}
