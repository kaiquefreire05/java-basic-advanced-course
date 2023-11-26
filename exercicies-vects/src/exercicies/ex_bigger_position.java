package exercicies;

import java.util.Locale;
import java.util.Scanner;

public class ex_bigger_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // Qtde de valores no vetor
		sc.nextLine();
		double vals[] = new double[n]; // Declarando o vetor
		
		int pos = 0; // Variável que vai receber a posição 
		double bnumber = 0; // Variável que vai receber o maior valor
		
		for(int i=0;i < vals.length;i++) {
			vals[i] = sc.nextDouble(); // Adicionando o valor no vetor
			if (vals[i] > bnumber) {
				bnumber = vals[i];
				pos = i;
			}
		}
		System.out.println("HIGHEST VALUE = " + bnumber);
		System.out.println("HIGHEST VALUE POSITION = "+ pos);
		
		
		
		
		sc.close();
	}
}
