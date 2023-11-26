package entities;

public abstract class TaxPayer {
	
	private String name;
	private double anualIncome;
	
	// construtores
	
	 public TaxPayer() {}

	public TaxPayer(String name, double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	// getters e setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	// métodos da classe abstrata
	
	public abstract Double tax();
	
}
