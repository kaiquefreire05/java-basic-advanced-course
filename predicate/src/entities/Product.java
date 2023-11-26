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
	
	// gettters e setters
	
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
	
	// métodos da classe
	
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}
	
	// opção sem usar o get do objeto
	public boolean nonStaticProductPredicate() {
		return price >= 100.0;
	}
	
	// to string
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
	
	
}
