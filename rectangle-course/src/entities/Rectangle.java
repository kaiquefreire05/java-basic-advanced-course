package entities;

public class Rectangle {
	public double widht; // Largura
	public double height; // Altura
	
	public double Area() {
		return widht * height;
	}
	
	public double Perimeter(){
		return 2 * (widht + height);
	}
	public double Diagonal(){
		return Math.sqrt(Math.pow(widht, 2) + Math.pow(height, 2));
	}
}
