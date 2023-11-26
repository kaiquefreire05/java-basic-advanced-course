package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.Name = sc.nextLine();
		
		System.out.println("Gloss Salary: ");
		employee.GlossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		employee.Tax = sc.nextDouble();
		
		System.out.println(employee.toString());
		System.out.println("Which percentage to increase salary: ");
		double porcent_increase = sc.nextDouble();
		employee.IncreaseSalary(porcent_increase);
		System.out.println(employee.toString());
		
		sc.close();
	}

}
