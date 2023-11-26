package services;

public class UsaInterestServices implements InterestService{
	
	private Double interestRate;
	
	// construtores
	
	public UsaInterestServices(Double interestRate) {
		super();
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
