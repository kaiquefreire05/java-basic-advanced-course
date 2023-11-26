package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// list.forEach(new PriceUpdate()); // método usando uma classe única, implementando interface
		// list.forEach(Product::staticPriceUpdate); // Reference method usando método estático
		// list.forEach(Product::nonStaticPriceUpdate); // Reference method usando método não estático
		
		// usando consumer declarado
		/*double factor = 1.1;
		Consumer<Product> cons = p ->  p.setPrice(p.getPrice() * factor);
		list.forEach(cons);*/
		
		// lamba in line
		double factor = 1.1;
		list.forEach(p -> p.setPrice(p.getPrice() * factor));

		list.forEach(System.out::println);

	}

}
