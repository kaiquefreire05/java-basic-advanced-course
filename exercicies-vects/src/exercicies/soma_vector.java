package exercicies;

import java.util.Locale;
import java.util.Scanner;

public class soma_vector {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // Tamanho do vetor
		double vals[] = new double[n];
		
		double sum = 0; // Inicializando variável para somar os valores
		for(int i=0;i<vals.length;i++) {
			vals[i] = sc.nextDouble(); // Adicionando valor ao vetor
			sum += vals[i];
		}
		System.out.printf("A soma dos valores é %.2f\n", sum);
		System.out.printf("A media dos valores é %.2f\n", sum / vals.length);
		
		
		sc.close();
	}
}
