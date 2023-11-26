package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// C:\\Users\\kaiqu\\OneDrive\\Documentos\\in.txt
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the full path: ");
		String path = sc.nextLine();
		System.out.print("Enter salary: ");
		Double salary = sc.nextDouble();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Employee> emp = new ArrayList<>();
			String line = br.readLine(); // lendo a linha
			
			// Adicionando cada respectivo campo na lista
			
			while (line != null) {
				String[] fields = line.split(",");
				emp.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine(); // lendo a próxima linha
				
			}
			
			// pegandoa as pessoas com salario menor do que foi pedido
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()); // criando um comparador de string
			
			// pegando os emails
			
			List<String> emails = emp.stream() // transformando a lista temporariamente em stream
					.filter(p -> p.getPrice() < salary) // 'filtrando' os valores menor que o salario
					.map(p -> p.getEmail()) // a ação vai ser coletar o email e colocar na lista
					.sorted(comp) // organizando em ordem crescente
					.collect(Collectors.toList()); // transformando em lista
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
			emails.forEach(System.out::println); // printando os emails
			
			// pegando a soma de price das pessoas com nome que começa com 'n'
			
			double sum = emp.stream() // transformando a lista temporariamente em stream
					.filter(x -> x.getName().charAt(0) == 'M') // fazendo a verificação do nome que começa com M
					.map(x -> x.getPrice()) // pegando o valor
					.reduce(0.0, (x, y) -> x + y); // a variavel vai começar com 0 e vai seguir somando os valores
			
			System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
