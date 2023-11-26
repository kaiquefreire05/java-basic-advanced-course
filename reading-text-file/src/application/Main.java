package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\kaiqu\\OneDrive\\Documentos\\in.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) 
				System.out.println(sc.nextLine());

			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error: " + e.getMessage());
			
		} finally {
			// se o sc estiver valendo nulo vai disparar um null pointer exception,
			// ele deve ser fechado apenas quando ele for diferente de nulo
			if (sc != null)
			sc.close();
		}

		
		
		
	}

}
