import java.util.Scanner;

public class ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício 05

		Scanner sc = new Scanner(System.in);

		int codItem = sc.nextInt();
		int qtdeItem = sc.nextInt();

		double total;
		
		// Fazendo todas as condições 
		if (codItem == 1) {
			total = qtdeItem * 4.00;
			
		} else if (codItem == 2) {
			total = qtdeItem * 4.50;
			
		} else if(codItem == 3){
			total = qtdeItem * 5.00;
			
		} else if (codItem == 4) {
			total = qtdeItem * 2.00;
			
		} else {
			total = qtdeItem * 1.50;
		}
		
		System.out.printf("Total a pagar: R$ %.2f", total);
		sc.close();
	}
}
