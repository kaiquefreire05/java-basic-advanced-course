import java.util.Locale; 
import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US); // Definindo para padrão americano para ter '.'
		Scanner sc = new Scanner(System.in); // Cria o scanner que recebe a variável sc

		String s1, s2, s3;
		int x;
		/*O nextLine consome o enter no nextInt, então deve adicionar um 
		nextLine a mai para conseguir dar a troca de linha */
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine(); // Lê  a linha inteira
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
