package application;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> myStrs = Arrays.asList("Maria", "Kaique", "Paulo", "Bob", "João");
		printList(myStrs);
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
