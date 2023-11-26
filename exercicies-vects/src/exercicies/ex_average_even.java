package exercicies;

import java.util.Locale;
import java.util.Scanner;

public class ex_average_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Média dos números pares
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantity elements: ");
		int n = sc.nextInt();
		int vals[] = new int[n];
		
		int even_sum = 0; // Soma dos pares
		int qtde_even = 0; // Quantidade de pares
		
		for (int i=0;i<vals.length;i++) {
			System.out.print("Enter a number: ");
			vals[i] = sc.nextInt();
			
			if(vals[i] % 2 == 0) { // Verificando se o valor é par
				even_sum += vals[i];
				qtde_even ++;
			}
		}
		if(qtde_even == 0) {
			System.out.println("No even numbers");
		} else {
			System.out.println("Average of even numbers = "+ (double)even_sum / qtde_even);
		}
		
		sc.close();
	}
}
