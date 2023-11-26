import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // qtde de vezes que vai ser return
		int soma = 0; // acumulador
		
		for (int i = 0; i<n; i++) {
			int x = sc.nextInt();
			soma += x;
		} // Fechando laço for
		System.out.println(soma);
		
		// Contagem regressiva
		
		for(int k=10;k>=0; k--) {
			System.out.println("Valor de K: " + k);
		} // Fechando laço for
		
		
	}
}
