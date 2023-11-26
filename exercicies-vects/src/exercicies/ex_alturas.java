package exercicies;

import java.util.Locale;
import java.util.Scanner;

import entities.PeopleSize;

public class ex_alturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		PeopleSize psl[] = new PeopleSize[n];
		
		double sum_sizes = 0.0;
		int qtde_kid = 0;
		for (int i=0;i < psl.length;i++) {
			System.out.printf("Dados da %da pessoa: \n", i+1);
			System.out.print("Nome: ");
			String people = sc.nextLine(); // Variaveis que serão adicionadas no vetor
			System.out.print("Idade: ");
			int years = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			double size = sc.nextDouble();
			sc.nextLine();
			psl[i] = new PeopleSize(people, years, size); // Adicionando elas no vetor na posição i
			sum_sizes += psl[i].getSize();			
			if (psl[i].getYears() < 16) {
				qtde_kid += 1;
			}
		}
		double porcent_kid = (double)qtde_kid / psl.length * 100;
		System.out.printf("A média de altura é %.2f\n", sum_sizes / psl.length);
		System.out.printf("Porcentagem de pessoas com menos de 16: %.1f %%", porcent_kid);
		sc.close();
	}
}
