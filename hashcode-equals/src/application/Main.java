package application;

import entities.Client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Kaique", "kaique@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode()); // pegando o código para comparar
		System.out.println(c2.hashCode()); // pegando o código para comparar
		System.out.println(c1.equals(c2)); // comparando
		System.out.println(c1 == c2); // aqui ele compara referência de memória
		System.out.println(s1 == s2);
	}

}
