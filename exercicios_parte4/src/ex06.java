import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercicio 06

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}