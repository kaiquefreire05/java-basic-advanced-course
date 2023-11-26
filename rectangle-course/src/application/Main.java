package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle(); // Criando a variável rectangle do objeto Rectangle.
		
		System.out.println("Enter rectangle widht and height: "); // Pedindo as duas variáveis do objeto
		rectangle.height = sc.nextDouble();
		rectangle.widht =  sc.nextDouble();
		
		// Printando valores
		System.out.println("AREA = " + rectangle.Area());
		System.out.println("AREA = " + rectangle.Perimeter());
		System.out.println("AREA = " + rectangle.Diagonal());
		
		sc.close();
	}
}
