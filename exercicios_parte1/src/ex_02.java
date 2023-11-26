import java.util.Locale;
import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r, pi = 3.14159; //Criando as variáveis
		
		r = sc.nextDouble(); // Pedindo o número no console
		
		double area = pi * r * r; // Fazendo o cálculo da área
		
		System.out.printf("O valor da área é %.4f", area); // Print formatado
		
		sc.close(); // Fechando a execução
	}

}
