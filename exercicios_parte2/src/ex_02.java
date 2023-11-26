import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício 02

		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt(); // Declarando e pedindo um valor na mesma linha

		if (numero % 2 == 0) {
			System.out.println("Esse número é par!");
		} else {
			System.out.println("Esse número é ímpar!");
		}

		sc.close();
	}
}
