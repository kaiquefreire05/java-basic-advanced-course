package tools; // Pacote da classe

public class Cashier { // Nome classe
	
	private int id;
	private String houlder;
	private double balance;
	
	//Construtores
	
	public Cashier(int id, String houlder) {
		super();
		this.id = id;
		this.houlder = houlder;
	}
	
	public Cashier(int id, String houlder, double initialDeposit) {
		super();
		this.id = id;
		this.houlder = houlder;
		deposit(initialDeposit);
	}
	
	// GETS AND SETTERS
	
	public String getHoulder() {
		return houlder;
	}

	public void setHoulder(String houlder) {
		this.houlder = houlder;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	// Funções do objeto
	
	public void deposit(double amount){ // Amount = Quantidade
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.00;
	}
	
	public String toString() {
		return "Account " + id + ", Holder " + houlder +
				", Balance: $" + String.format("%.2f", balance);
	}
	
}
