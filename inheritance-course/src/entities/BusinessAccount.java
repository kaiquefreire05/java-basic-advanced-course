package entities;

public final class BusinessAccount extends Account{ // extends faz a herança entre classes
// quando adicionada o 'final', significa que ela não pode ser herdada
// pode ser adicionado em métodos
	
	private Double loanLimit;

	// construtores
	public BusinessAccount() {super();}
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // argumentos da outra classe
		this.loanLimit = loanLimit; // argumentos dessa classe
		
	}
	
	// getters e setters
	
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	// funções do objeto
	public void loan(double amount) {
		if (amount <= loanLimit) { // verifica se a quantia é menor que o limite de empréstimo
			balance += amount - 10.0;
		}
	}
	
	// saque da conta 
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
}
