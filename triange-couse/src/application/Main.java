package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Criando o "pacote de variável"
		Triangle x, y; 
		x = new Triangle();
		y = new Triangle();
		
		// Adicionando os valores para cada pacote
		System.out.println("Enter the measures of Tringle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of Tringle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		// Chamando a função area
		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Tringule X area: %.4f\n", areaX);
		System.out.printf("Tringule Y area: %.4f\n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area : X");
		} else {
			System.out.println("Larger area : Y");
		}

		sc.close();
	}
}
