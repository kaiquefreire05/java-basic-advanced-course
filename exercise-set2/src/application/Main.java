package application;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		// SET A
		System.out.print("How many students for course A? ");
		int qtde = sc.nextInt();

		for (int i = 0; i < qtde; i++) {
			int n = sc.nextInt();
			a.add(n);
		}

		// SET B
		System.out.print("How many students for course B? ");
		qtde = sc.nextInt();

		for (int i = 0; i < qtde; i++) {
			int n = sc.nextInt();
			b.add(n);
		}

		// SET C
		System.out.print("How many students for course C? ");
		qtde = sc.nextInt();

		for (int i = 0; i < qtde; i++) {
			int n = sc.nextInt();
			c.add(n);
		}
		
		// COMPARANDO OS ALUNOS
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total students: " + total.size());
		sc.close();
	}

}
