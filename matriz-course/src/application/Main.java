package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		// adicionando os valores na matriz n * n.
		for(int l=0;l<mat.length;l++) {
			for (int c=0;c<mat[l].length;c++) {
				mat[l][c] = sc.nextInt();
			}
		}
		
		// Pegando os valores da diagonal principal
		System.out.println("Main diagonal: ");
		for (int i=0;i<mat.length;i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for (int l=0;l<mat.length;l++) {
			for (int c=0;c<mat[l].length;c++) {
				if (mat[l][c] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative number: "+ count);
		sc.close();
		
		
	}
}
