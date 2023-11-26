package entities;

import java.util.Date;

public class Order {
	
	 private Date date;
	 private Product product;
	 
	 // Construtor
	public Order(Date date, Product product) {
		super();
		this.date = date;
		this.product = product;
		this.product.name = "TV";
	}
	
	// GETTERS ANS SETTERS
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	 
	 
}
