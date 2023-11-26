import java.util.Scanner;

public class Main {
	// Função padrão do Java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c =  sc.nextInt();
		
		int higher = max(a, b, c);
		showResult(higher);
		sc.close();
	}
	
	// 'Public', ela fica disponível em todas as classes.
	// 'Static', para que essa função possa ser chamada independente de criar um objeto.
	public static int max(int pa, int pb, int pc) {
		
		int high_number;
		if (pa > pb && pa > pc) {
			high_number = pa;
			
		} else if(pb > pa && pb > pc) {
			high_number = pb;
			
		} else {
			high_number = pc;
		}
		
		return high_number; // Retornando o valor desejado
	}
	
	// Função de mostrar o resultado
	public static void showResult(int p_value) {
		System.out.println("Higher = " + p_value);
	}
}
