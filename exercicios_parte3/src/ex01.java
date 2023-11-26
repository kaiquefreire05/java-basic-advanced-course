import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercicio 01

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int senha = 0; // Declarar sempre variável antes

		while (senha != 2002) {
			senha = sc.nextInt();
			if (senha == 2002) {
				System.out.println("Acesso permitido");
			} else {
				System.out.println("Acesso negado.");
			}
			
		} // Fechando While
	}
}
