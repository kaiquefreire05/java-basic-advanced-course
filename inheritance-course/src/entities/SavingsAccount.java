package entities;
// poupança
public class SavingsAccount extends Account{
	
	private Double interestRate;
	
	
	// construtores 
	
	public SavingsAccount(){super(); }

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance); // argumentos da superclasse
		this.interestRate = interestRate; // atribuindo a taxa de juros
		
	}
	
	// getters e setters
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	// funções do objeto
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	// saque
	@Override
		public final void withdraw(double amount) {
			balance -= amount;
		}
	
	
}
