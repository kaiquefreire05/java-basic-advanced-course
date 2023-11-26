package entities;

public class Account {
	
	private Integer number;
	private String holder;
	protected Double balance; // mudar para protected para a outra classe poder usar essa variável
	

	// construtores
	
	public Account() {} // padrão
	
	public Account(Integer number, String holder, Double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	// getter e setters 
	

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	// funções do objeto
	
	// saque
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	// deposito
	public void deposit(double amount) {
		balance += amount;
	}
	
}
