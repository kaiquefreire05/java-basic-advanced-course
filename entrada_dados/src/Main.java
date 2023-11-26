import java.util.Locale; // Pegar localização do código
import java.util.Scanner; // Importação do scanner para entrar dados

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US); // Color antes do scanner para poder colocar '.'
		Scanner sc = new Scanner(System.in); // Cria o scanner
		
		// Scanner para pegar uma string
		
		String x_string;
		
		x_string = sc.next(); // Pega apenas string
		System.out.println("Você digitou: " + x_string);
		
		// Scanner para pegar um número inteiro
		
		int x_int;
		
		x_int = sc.nextInt(); // nextInt pega um número inteiro
		System.out.println("Você digitou o número inteiro: " + x_int);
		
		// Pegando com o valor Double
		
		double x_double;
		
		x_double = sc.nextDouble(); // nextDouble pega um valor double
		System.out.println("Você pegou o valor double: " + x_double);
		
		// Ler um caractere
		
		char x_char;
		
		x_char = sc.next().charAt(0); // .charAt, pega o primeiro caractere de uma string
		System.out.printf("Você pegou o caractere: %s\n", x_char);
		
		// Ler varios valores na mesma linha
		
		String a;
		int b;
		double c;
		
		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		sc.close(); // Se o scanner estiver fechado, todo código após não será executado.
	}
}
 