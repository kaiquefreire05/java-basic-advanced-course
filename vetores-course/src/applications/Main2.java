package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // Tamanho do vetor
		
		Product[] vect = new Product[n]; // Criando um vetor da classe Product
		
		for (int i=0; i < vect.length;i++) {
			sc.nextLine();
			String name = sc.nextLine(); // String que vai entrar no vetor
			double price = sc.nextDouble(); // Double que vai entrar no vetor
			vect[i] = new Product(name, price); // Adicionando conforme o 'i' no vetor
		}
		// Fazendo a soma dos prices
		double sum = 0.0;
		for(int i=0; i<vect.length;i++) {
			sum += vect[i].getPrice(); // Usando o getter do price para adicionar no vetor
		}
		// Fazendo a média
		double avg = sum / vect.length;
		System.out.printf("Average price: %.2f", avg);
		sc.close();
	}
}
