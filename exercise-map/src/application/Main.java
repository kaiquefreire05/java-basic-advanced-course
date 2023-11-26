package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// C:\\Users\\kaiqu\\OneDrive\\Documentos\\in.txt

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> listVotes = new LinkedHashMap<>();

		// pedindo o caminho do arquivo
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		// lendo o arquivo e fazendo as funções do Map
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine(); // lendo a linha

			while (line != null) {

				String[] fields = line.split(","); // divindindo a string
				String name = fields[0]; // pegando o nome do candidato
				int votes = Integer.parseInt(fields[1]); // pegando o número de votos

				if (listVotes.containsKey(name)) {

					int votosSoFar = listVotes.get(name);
					listVotes.put(name, votes + votosSoFar);
				} else {
					
					listVotes.put(name, votes);
				}

				line = br.readLine(); // continuar lendo a linha até acabar
			} // fechamento do while
			
			// printando os votos
			for (String key : listVotes.keySet())
				System.out.println(key + ": " + listVotes.get(key));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
