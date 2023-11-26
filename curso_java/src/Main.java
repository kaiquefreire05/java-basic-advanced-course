import java.util.Locale; // Importação para mudar a localização do APP

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Println - Quebra a linha 
		// Printf - Você printa de forma formatada

		int y = 32;
		double x = 10.35784;

		System.out.println(y);
		System.out.printf("%.2f\n", x); // "%.2f\n", formata 2 casas e quebra a linha
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n", x);

		//Formas de printar concatenado

		System.out.println("Resultado é: " + x + " m/2");
		System.out.printf("Resultado é: %.2f m/2\n", x);
		
		// Concatenando vários elementos em um mesmo print
		
		/* %f - Float
		 * %d = Número Inteiro
		 * %s = Strinf ou texto
		*/
		String nome = "Kaique";
		int idade = 18;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha por mês R$ %.2f reais%n", nome, idade, renda);
	
		// EXERCICIO
		
		String product1 = "Computer";
		String product2 = "Officer desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products: ");
		System.out.printf("%s, which price is $ %.2f\n", product1, price1);
		System.out.printf("%s, which price is $ %.2f\n", product2, price2);
		
		System.out.printf("%d years old, code %d and gender %s\n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f\n", measure);
		System.out.printf("Rounded(three decimal places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f\n", measure);
	
	}

}
