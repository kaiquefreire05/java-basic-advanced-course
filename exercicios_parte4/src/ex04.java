import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercicio 04

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("Esse tipo  de divisão é impossével.");
			} else {
				double div = (double) x / y;
				System.out.printf("O valor da divisão é: %.1f", div);
			}
		} // Fim laço for
		sc.close();
	}
}
