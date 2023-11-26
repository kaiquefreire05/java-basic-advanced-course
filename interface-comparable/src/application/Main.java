package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		String path = "C:\\Users\\kaiqu\\OneDrive\\Documentos\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			// lendo o nome do arquivo
			String name = br.readLine();
			while (name != null) {
				list.add(name);
				name = br.readLine();

			}
			// organizando e printando
			Collections.sort(list); // ordenando a lista
			for (String s : list)
				System.out.println(s);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
