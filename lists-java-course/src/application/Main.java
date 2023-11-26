package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> list = new ArrayList<>(); // Criando lista
		
		list.add("Maria");
		list.add("Teresa");
		list.add("Alex");
		list.add("Beatriz");
		list.add(2, "Kaique");
		
		System.out.println("O tamanho da lista é "+ list.size()); // Tamanho da lista
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------");
		list.remove(4);
		list.removeIf(x -> x.charAt(0) == 'A'); // Removendo da lista quem tem o 'A' como primeiro caracter
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------");
		System.out.println("Index of Kaique: "+ list.indexOf("Kaique")); // Se tiver ele mostra a posição, senão retorna -1
		System.out.println("-----------------------");
		list.add("Ana");
		list.add("Lucas");
		list.add("Marcos");
		list.add("Murilo");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		// Criando uma lista somente com os nomes que começam com M
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("-----------------------");
		// Comando para encontrar o primeiro nome começado com a 
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		System.out.println(name1);
	}
}
