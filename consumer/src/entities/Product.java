package entities;

public class Product {
	
	private String name;
	private double price;
	
	// construtores
	
	public Product() {}
	
	public Product(String name, double price) {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	// consumer usando método static
	
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	// consumer usando método não static
	
	public void nonStaticPriceUpdate() {
		//setPrice(getPrice() * 1.1);
		price *= 1.1; // outra forma
	}
	
	// to string
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
	
	
}	
