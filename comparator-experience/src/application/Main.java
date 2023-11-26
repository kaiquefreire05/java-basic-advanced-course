package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 450.0));
		
		// criando uma variável e comparando no mesmo programa, usando arrow function
		@SuppressWarnings("unused")
		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		// list.sort(comp);
		// list.sort(new MyComparator());

		for (Product p : list)
			System.out.println(p);

	}

}
