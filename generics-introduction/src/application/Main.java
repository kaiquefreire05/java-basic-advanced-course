package application;

import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		PrintService<String> ps = new PrintService<>();
		
		System.out.print("How many values: ");
		int n = sc.nextInt();
		
		for(int i=0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print(); // printando valores
		String x = ps.first();
		System.out.println("First: " + x); // pegando o primeiro
		
		
		sc.close();
	}

}
