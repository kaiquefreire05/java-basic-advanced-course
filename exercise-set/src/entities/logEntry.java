package entities;

import java.util.Date;
import java.util.Objects;

public class logEntry {
	
	private String username;
	private Date moment;
	
	// construtores
	
	public logEntry(String username, Date moment) {
		super();
		this.username = username;
		this.moment = moment;
	}
	
	// gettters e setters
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	// hashcode e equals
	
	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		logEntry other = (logEntry) obj;
		return Objects.equals(username, other.username);
	}
	
	
	
}
