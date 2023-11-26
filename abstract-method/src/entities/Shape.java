package entities;

import entities.enums.Color;

public abstract class Shape {
	
	private Color color; // classe color 
	
	
	// construtores
	
	public Shape() {}
	
	public Shape(Color color) {
		super();
		this.color = color;
	}

	// getters e setters
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	// métodos 
	public abstract double area();
}
