import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercicio 1

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		} // Fim laço for 
		
		sc.close();
	}
}
