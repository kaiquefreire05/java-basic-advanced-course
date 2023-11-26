package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc1 = new Account(1001, "Kaique", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1001, "Felipe", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Maria", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
	}
}
