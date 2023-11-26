import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		int diferenca = a * b - c * d;
		System.out.printf("A diferença do produto %d e %d e o produto %d e %d é %d", a, b, c, d, diferenca);
		
		sc.close();
	}

}
