package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Account acc = new Account(1001, "Kaique", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// upcasting
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Pedro" , 0.0 , 200.00);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		// downcasting
		
		BusinessAccount acc4 = (BusinessAccount)acc2; 
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; // acc3 é uma SavingsAccount
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(100.0);
			System.out.println("Loan!");
			
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		
		
		
	}
}
