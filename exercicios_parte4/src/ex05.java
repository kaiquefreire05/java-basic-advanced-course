import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercicio 5

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int fatorial = 1;
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		} // Fechamento laço for

		System.out.printf("O fatorial de %d é igual a: %d", n, fatorial);
		sc.close();
	}
}
