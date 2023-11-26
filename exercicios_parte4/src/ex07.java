import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercicio 07
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println("Número deve ser positivo!");
		} else {
			for(int i=1;i <= n;i++) {
				int p = i;
				int s = i * i;
				int t = i * i * i;
				System.out.printf("%d , %d , %d\n", p, s, t);
			}
		}
		sc.close();
	}
}
