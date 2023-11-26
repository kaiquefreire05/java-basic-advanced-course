package entities;

public class Individual extends TaxPayer{
	
	private Double healthSpending;
	
	// construtores
	
	public Individual() {}

	public Individual(String name, double anualIncome, Double healthSpending) {
		super(name, anualIncome);
		this.healthSpending = healthSpending;
	}

	// getters e setters
	
	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}
	
	// métodos da classe
	
	// taxa de pessoa individual
	@Override
	public Double tax() {
		// TODO Auto-generated method stub
		if (getAnualIncome() < 20000.00)
			return getAnualIncome() * 0.15 - healthSpending * 0.5;
		else 
			return getAnualIncome() * 0.25 - healthSpending * 0.5;
	}
	
	
}
