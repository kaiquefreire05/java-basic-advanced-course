import java.util.Scanner;

public class ex_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício 03
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("Esses números são múltiplos.");
		} else {
			System.out.println("Esses números não são múltiplos.");
		}
		
		sc.close();
	}
}
