import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício 01
		
		Scanner sc = new Scanner(System.in); // Scanner que recebe um número
		int numero; // Criando a variável
		numero = sc.nextInt(); // Pedindo número console
		
		
		if (numero >= 0) {
			System.out.println("Esse número é positivo.");
		} else {
			System.out.println("Esse número é negativo.");
		}
		
		sc.close(); // Fecha o scanner
	}
}
