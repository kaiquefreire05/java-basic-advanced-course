package services;

public class BrazilInterestServices implements InterestService{
	
	private Double interestRate;
	
	// construtores
	
	public BrazilInterestServices(Double interestRate) {
		super();
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
