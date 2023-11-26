package application;

import java.io.File;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// C:\\Users\\kaiqu\\OneDrive\\Documentos\\in.txt
		System.out.println("getName: " + path.getName()); // somente nome arquivo
		System.out.println("getParent: " + path.getParent()); // somente o caminho
		System.out.println("getPath: " + path.getPath()); // pega geral
		
		sc.close();
	}

}
