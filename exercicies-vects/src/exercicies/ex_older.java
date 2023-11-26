package exercicies;

import java.util.Locale;
import java.util.Scanner;

import entities.PeopleOlder;

public class ex_older {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Mais velho
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people are you going to add? ");
		int n = sc.nextInt();
		sc.nextLine();
		PeopleOlder vect[] = new PeopleOlder[n]; // Criando um vetor da classe
		
		for (int i=0;i<vect.length;i++) {
			System.out.printf("%d person´s data: \n", i+1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			sc.nextLine();
			vect[i] = new PeopleOlder(age, name); // Usando o construtor para adicionar no vetor
			
		}
		int age_older = 0;
		String name_older = "";
		for (int i=0;i<vect.length;i++) {
			if (vect[i].getAge() > age_older) {
				age_older = vect[i].getAge();
				name_older = vect[i].getName();
			}
		}
		
		System.out.println("Older person is "+ name_older);
		sc.close();
	}
}
