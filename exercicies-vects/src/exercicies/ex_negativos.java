package exercicies;

import java.util.Locale;
import java.util.Scanner;

public class ex_negativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int vals[] = new int[n]; // Tamanho do vetor vals = n
		
		for(int i=0;i<vals.length;i++) {
			vals[i] = sc.nextInt();
		}
		
		for(int i=0;i<vals.length;i++) {
			if (vals[i] < 0) {
				System.out.println("Esse valor é negativo: " + vals[i]);
			}
		}
		
		sc.close();
	} 
}
