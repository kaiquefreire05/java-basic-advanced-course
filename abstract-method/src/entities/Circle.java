package entities;

import entities.enums.Color;

public class Circle extends Shape{

	private Double radius;
	
	// construtores
	
	public Circle() {}
	
	public Circle(Color color, Double radius) {
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

	// métodos da classe

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius; // radius ao quadrado
	}

}
