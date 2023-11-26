package exercicies;

import java.util.Locale;
import java.util.Scanner;

import entities.SchoolApproval;

public class ex_school_approval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // Quantidade de valores para adicionar no vetor
		sc.nextLine();
		SchoolApproval students[] = new SchoolApproval[n]; // Criando o vetor para receber os alunos
		
		for(int i=0;i<students.length;i++) {
			System.out.printf("Enter the name, first and second grade of the %dst student: \n", i+1);
			System.out.print("Name: ");
			String name = sc.nextLine(); // Pedindo nome
			System.out.print("Grade 1: ");
			double n1 = sc.nextDouble(); // Pedindo nota 1
			sc.nextLine();
			System.out.print("Grade 2: ");
			double n2 = sc.nextDouble(); // Pedindo nota 2 
			sc.nextLine();
			students[i] = new SchoolApproval(name, n1, n2); // Adiciondo no vetor do objeto
		}
		
		// Exibindo apenas os nomes dos alunos aprovados
	    for (int i = 0; i < students.length; i++) {
	        if (students[i].isAprovado()) {
	            System.out.println(students[i].getName());
	        }
	    }
	    
		sc.close();
	}
}
