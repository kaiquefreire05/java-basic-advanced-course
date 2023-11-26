package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		String path = "C:\\Users\\kaiqu\\OneDrive\\Documentos\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine(); // lendo a linha
			while (line != null) {
				String [] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1]))); // adicionando a linha na lista transformada em Product
				line = br.readLine(); // depois que adiciona a linha, passa para a próxima
			} // fechamento while

			Product x = CalculationService.max(list);
			System.out.println("Max: ");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
