package application;

import java.io.File;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine(); // nome da pasta
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory); // criando um vetor de files
		System.out.println("FOLDERS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		// boolean sucess = new File(strPath + "\\subdir").mkdir();
		// System.out.println("Directory created sucessfully: " + sucess);
		
		sc.close();
	}

}
