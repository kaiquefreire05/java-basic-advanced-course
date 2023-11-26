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
	
	// getteres e setters
	
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
	
	// usando método static
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}
	
	// sem usar o static
	
	public String nonStaticUpperCaseName() { // quando ele não é static, ele trabalha somente com o própio objeto
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

}
