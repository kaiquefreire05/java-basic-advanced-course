package entities;

public class Company extends TaxPayer{
	
	private double numberEmployees;
	
	// construtores
	
	public Company() {}
	
	public Company(String name, double anualIncome, double numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}
	
	// getters e setters
	
	public double getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(double numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	
	// métodos da classe
	
	@Override // veio herdada de uma classe
	public Double tax() {
		// TODO Auto-generated method stub
		if (numberEmployees > 10)
			return getAnualIncome() * 0.14;
		else
			return getAnualIncome() * 0.16;
	}
}
