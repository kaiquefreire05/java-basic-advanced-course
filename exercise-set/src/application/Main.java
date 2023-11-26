package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.logEntry;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		// C:\\Users\\kaiqu\\OneDrive\\Documentos\\in.txt
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Set<logEntry> set = new HashSet<>();
			
			String line = br.readLine();
			while(line != null) {
				
				String[] fields = line.split(" ");
				String username = fields[0]; // pegando nome
				Date moment = Date.from(Instant.parse(fields[1])); // pegando a hora
				
				set.add(new logEntry(username, moment));
				
				line = br.readLine();	
			} // fechamento do while
			
			System.out.println("Total users: " + set.size());
			
		} catch (IOException e) {
			
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
		
	}

}
