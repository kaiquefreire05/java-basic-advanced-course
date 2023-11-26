package utility;

public class Calculator {
	
	public static final double PI = 3.14159; // Quando atribuído 'final' ele não pode mudar mais.
	
	public static double circumference(double paradius) { // paradius = parâmetro radius
		return 2.0 * PI * paradius;
	}
	
	public static double volume(double paradius) {
		return 4.0 * PI * paradius * paradius * paradius / 3.0;
	}
	
}
