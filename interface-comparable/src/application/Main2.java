package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list = new ArrayList<>();
		String path = "C:\\Users\\kaiqu\\OneDrive\\Documentos\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			// lendo o nome do arquivo
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1]))); // quando sai do vetor ele é string, então tem que passar para double
				employeeCsv = br.readLine();

			}
			// organizando e printando
			Collections.sort(list); // ordenando a lista
			for (Employee emp : list)
				System.out.println(emp.getName() + ", " + emp.getSalary());

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
