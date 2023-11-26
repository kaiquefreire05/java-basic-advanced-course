package exercicies;

import java.util.Locale;
import java.util.Scanner;

public class ex_below_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Below avarege - Abaixo da média
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many elements will the vector have? ");
		int n = sc.nextInt(); // qtde de valores que vai existir no vetor
		sc.nextLine();
		double vect[] = new double[n];
		
		double sum_values = 0; // Soma dos valores do vetor
		for(int i=0;i<vect.length;i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
			sum_values += vect[i];
		}
		double average = sum_values / vect.length; // Calculando a média
		System.out.println("Vect average: "+ average);
		
		System.out.println("Below average elements:");
		for(int i=0;i<vect.length;i++) {
			if(vect[i] <= average) {
				System.out.print(vect[i] + " ");
			}
		}
		
		sc.close();
	}
}
