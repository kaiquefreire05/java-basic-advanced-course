package exercicies;

import java.util.Locale;
import java.util.Scanner;

import entities.PeoplesBoardingH;

public class ex_pensionato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		PeoplesBoardingH[] vect = new PeoplesBoardingH[10];
		
		System.out.print("How many rooms will be rented? "); // Lendo a quantidade de quartos que vai ser alugados
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			System.out.printf("Rent #%d\n", i+1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room Number: ");
			int pos = sc.nextInt();
			sc.nextLine();
			
			while(true) {
				if (pos > vect.length) {
					System.out.print("Invalid position, try again. Only rooms 1 to 10.");
					pos = sc.nextInt();
				} else {
					vect[pos] = new PeoplesBoardingH(name, email);
					break;
				}
			}
		}
		
		// Mostrando quais quartos estão vazios
		System.out.println("Busy Rooms: ");
		for(int i=0;i<vect.length;i++) {
			if(vect[i] != null) {
				System.out.printf("%d: %s, %s\n", i, vect[i].getName(), vect[i].getEmail());
			}
		}
			
		sc.close();
	}
}
