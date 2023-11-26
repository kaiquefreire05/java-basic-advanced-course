import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercicio 03

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			tipo = sc.nextInt();
			if (tipo == 1) {
				alcool += 1;
				
			} else if (tipo == 2) {
				gasolina += 1;
				
			} else if (tipo == 3) {
				diesel += 1;
				
			} else if (tipo == 4){
				System.out.println("Sistema finalizado.");
				break;
			} else {
				System.out.println("Opção inválida. Tente novamente...");
			}
			
		} // Fechando laço While
		
		sc.close();
		System.out.println("Muito obrigado!");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	}
}
