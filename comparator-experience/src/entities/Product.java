package entities;

public class Product {
	
	private String name;
	private Double price;
	
	// construtores
	
	public Product() {}
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	// getters e setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	// to string
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
