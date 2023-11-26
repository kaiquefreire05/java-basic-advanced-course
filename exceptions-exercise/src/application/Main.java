package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
			System.out.println("Enter the account data: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, initialBalance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			
			try {
				acc.withdraw(amount);
				System.out.printf("New balance: %.2f%n", acc.getBalance());
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		
		sc.close();
	}

}
