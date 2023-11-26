package entities;

public class Product implements Comparable<Product>{
	
	String name;
	Double price;
	
	// construtor
	
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
		return name + ", " + String.format("%.2f", price);
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return price.compareTo(o.getPrice());
	}
	
}
