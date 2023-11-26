import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		int soma = a + b;
		
		System.out.printf("A soma entre %d e %d é igual a %d", a, b, soma);
		
		sc.close();

	}
}
