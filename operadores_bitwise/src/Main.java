import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Métodos bit wise

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mask = 0b00100000;
		
		if((n & mask) != 0){
			System.out.println("6Th bit is True! (1)");
		} else {
			System.out.println("6Th bit is False! (0)");
		}
		
		sc.close();
	}
}
