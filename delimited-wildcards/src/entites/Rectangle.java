package entites;

public class Rectangle implements Shape{
	
	private Double widht;
	private Double height;
	
	// construtores
	public Rectangle(Double widht, Double height) {
		super();
		this.widht = widht;
		this.height = height;
	}
	
	// getters e setters
	
	public Double getWidht() {
		return widht;
	}

	public void setWidht(Double widht) {
		this.widht = widht;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	// métodos da classe

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return widht * height;
	}
	
	
}
