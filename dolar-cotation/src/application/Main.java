package application;

import java.util.Locale;
import java.util.Scanner;

import tools.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			System.out.print("How many dollars will be bought? ");
			double qtde_dollar = sc.nextDouble();
			System.out.printf("Amount to be bad in reais = %.2f\n", CurrencyConverter.converter(qtde_dollar));
		sc.close();
	}
}
