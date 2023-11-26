package application;

import entities.Account;
import entities.SavingsAccount;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account x = new Account(1001, "Kaique", 1000.0);
		Account y = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
	}

}
