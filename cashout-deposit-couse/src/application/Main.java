package application;

import java.util.Locale;
import java.util.Scanner;

import tools.Cashier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US); // Mudando a linguagem do código
		Scanner sc = new Scanner(System.in); // Scanner de valores
		Cashier cx; // Declarando variavel do objeto para usar construtores e funções
		
		double value = 0; // Valores que vão ser retirados e adicionados
		
		System.out.print("Enter account number: ");
		int id = sc.nextInt();
		System.out.print("Enter account houlder: ");
		sc.nextLine();
		String houlder = sc.nextLine();
		
		System.out.print("Is there na inital deposit(y/n): ");
		char option = sc.next().charAt(0); // Pegando o primeiro caracter

		if (option == 'y') {
			System.out.print("Enter initial deposit: ");
			double initialDeposit = sc.nextDouble();
			cx = new Cashier(id, houlder, initialDeposit); // If, Chamando um construtor com depósito inicial
			
		} else {
			cx =  new Cashier(id, houlder); // Chamando construtor sem deposit inicial
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(cx.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		value = sc.nextDouble();
		cx.deposit(value);
		System.out.println("Updated account data: ");
		System.out.println(cx.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		cx.withdraw(value);
		System.out.println("Updated account data: ");
		System.out.println(cx.toString());
		
		sc.close(); // Fechando o scanner
	}
}
