package entities;

public class Product {
	
	String name; // Se não tiver public ou private ele só pode ser acessado no mesmo pacote.
	private double price; // Colocado o private eles não poderão ser acessador de outras classes, somente com get e setter.
	private int quantity; // Se tiver o public eles poderão ser acessados livremente
	
	// CONSTRUTORES
	
	public Product() {}
	
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	// GET AND SETTERS NOME 
	public String getName() {
		return name;
	}

	public void setName(String name) { // Void não retorna nada
		this.name = name;
	}
	
	// GET AND SETTERS PRICE
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// GET QUANTITY
	public int getQuantity() {
		return quantity;
	}

	// FUNÇÕES DO OBJETO
	public double totalValueInStock() {
	return price * quantity;
	}

	public void addProducts(int quantity) {
	this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
	this.quantity -= quantity;
	}
	
	public String toString() {
	return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
