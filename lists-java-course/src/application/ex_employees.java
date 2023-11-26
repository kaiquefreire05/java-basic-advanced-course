package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class ex_employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employees> list = new ArrayList<>(); // Criando uma lista que recebe o objeto Employees
		
		System.out.print("How many employees will be registred? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			// Pedindo as informações
			System.out.printf("Employee #%d:\n",i+1);
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			
			list.add(new Employees(id, name, salary)); // Cria uma nova instância de employees
		}
		
		System.out.print("Enter the employeer id that will have salary increase: ");
		int idIncrease = sc.nextInt();
		sc.nextLine();
		// Forma mais simples usando lambda
		// Employees emp = list.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);
		Integer pos = position(list, idIncrease); // Variável para verificar a posição do id
		if(pos == null) {
			System.out.println("This id not exist!");
		} else {
			System.out.print("Enter the percent: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent); // Acessando o funcionario que está na posição pos
		}
		System.out.println("List of employees: ");
		for(Employees emp:list) {
			System.out.println(emp);
		}
		
		sc.close(); // Fechando o scanner 
	}
	
	// Criando uma função auxiliar para verificar a posição do id
	// Se eu usar o Integer posso retornar 'null', senão tenho que colocar -1
	// .get(i) , serve para pegar algo na posição i
	public static Integer position(List<Employees> list, int id) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null; // Se não achar nenhum id igual ele return null
	}
	
	
}
