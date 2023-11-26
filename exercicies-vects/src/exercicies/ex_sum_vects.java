package exercicies;

import java.util.Locale;
import java.util.Scanner;

public class ex_sum_vects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // Quantidade de valores que vai ter no vetor
		int vectA[] = new int[n];
		int vectB[] = new int[n];
		int vectC[] = new int[n];

		System.out.println("Enter the values of vector A: ");
		for(int i=0;i<vectA.length;i++) { // Adicionado os valores do vetor A
			vectA[i] = sc.nextInt(); 
		}
		
		System.out.println("Enter the values of vector B: ");
		for(int i=0;i<vectB.length;i++) { // Adicionando os valores do Vetor B
			vectB[i] = sc.nextInt();
		}
		
		for(int i=0;i < vectC.length;i++) { // Somando os valores
			vectC[i] = vectA[i] + vectB[i];
		}
		
		System.out.println("Summed Values: ");
		// Exibindo o vetor de resultado
        for (int i = 0; i < vectC.length; i++) {
            System.out.print(vectC[i] + " ");
        }
        
		sc.close();
	}
}
