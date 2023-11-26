package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method1();
		
		System.out.println("End of program");
		
	}
	
	public static void method1() {
		System.out.println("=-=-=-=-= METHOD 1 STARTS =-=-=-=-=");
		
		method2();
		
		System.out.println("=-=-=-=-= METHOD 1 END =-=-=-=-=");
	}
	public static void method2() {
		
		System.out.println("=-=-=-=-= METHOD 2 STARTS =-=-=-=-=");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();

		} catch (InputMismatchException e) {
			System.out.println("Input Error!");
		}
		
		sc.close();
		System.out.println("=-=-=-=-= METHOD 2 END =-=-=-=-=");
	}
	
}
