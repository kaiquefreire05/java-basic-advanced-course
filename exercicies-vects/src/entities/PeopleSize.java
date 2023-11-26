package entities;

public class PeopleSize {
	private String people;
	private int years;
	private double size;
	
	// Construtores
	
	public PeopleSize(String people, int years, double size) {
		super();
		this.people = people;
		this.years = years;
		this.size = size;
	}

	// GETTERS E SETTERS
	
	public String getPeople() {
		return people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	
}
