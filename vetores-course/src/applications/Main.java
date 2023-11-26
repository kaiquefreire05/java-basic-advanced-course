package applications;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // Variável usada para decidir o tamanho do array
		double[] vect = new double[n]; // Criando um vetor de tamanho n 
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble(); // Vetor no posição 'i', vai receber o valor i = 0 pv = 0
			
		}
		double sum = 0;
		
		for(int i=0;i < n; i++) { // Usando a variavel n porque é do mesmo tamanho do array
			sum += vect[i];
		}
		double media = sum / n; 
		
		System.out.println(sum);
		System.out.println(media);
		sc.close();
	}
}
