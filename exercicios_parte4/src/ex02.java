import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercicio 2
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // qtde de valores
		
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.printf("%d in\n", in);
		System.out.printf("%d out\n", out);
		sc.close();
	}
}