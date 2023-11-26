package entites;

public class Circle implements Shape{
	
	private Double radius;
	
	// construtores
	
	public Circle(Double radius) {
		super();
		this.radius = radius;
	}

	// getters e setters
	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	// métodos cumpridos do Shape
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	
	
}
