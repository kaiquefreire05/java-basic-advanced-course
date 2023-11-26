import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Laço for

		Scanner sc = new Scanner(System.in); // Criando o scanner de valor
		int hora; // Definindo a varaável hora

		System.out.println("Que horas são?");
		hora = sc.nextInt(); // Pedindo um valor para a variável

		if (hora < 12) {
			System.out.println("Bom dia!");

		} else if (hora < 19) {
			System.out.println("Boa tarde!");

		} else {
			System.out.println("Boa Tarde!");
		}

		sc.close();

		// Testando o laço while

		int c = 0;
		while (true) {
			System.out.println(c);
			c++;
			if (c == 21) // Se tiver apenas um comando no laÇo for os '{' é opcional
				break;
		}

	}
}
