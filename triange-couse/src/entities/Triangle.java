package entities; // Pacote da classe

public class Triangle { // Nome da classe

	// Atributos da classe
	public double a;
	public double b;
	public double c;
	
	// Métodos da classe
	public double area() { // Tudo que era necessário para calcular a área está no corpo da classe
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
