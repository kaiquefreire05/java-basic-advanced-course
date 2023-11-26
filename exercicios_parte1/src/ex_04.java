import java.util.Locale;
import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, hrs_trabalhadas;
		double sal_hora;
		
		numero = sc.nextInt();
		hrs_trabalhadas = sc.nextInt();
		sal_hora = sc.nextDouble();
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("O salário é: %.2f", hrs_trabalhadas * sal_hora);
		sc.close();
	}
}
