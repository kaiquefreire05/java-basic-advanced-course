package application;

import java.util.Locale;
import java.util.Scanner;

public class ex_proposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of lines: ");
		int m = sc.nextInt();
		System.out.print("Enter the number of collums: ");
		int n = sc.nextInt();
		
		int [][] matriz = new int[m][n];
		
		for(int l=0;l<matriz.length;l++) {
			for(int c=0;c<matriz[l].length;c++) {
				matriz[l][c] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for(int l=0;l<matriz.length;l++) { // Vasculhando a linha
			for (int c=0;c<matriz[l].length;c++) { // Vasculhando a coluna
				if(matriz[l][c] == x) { // Encontrando a posição do valor
					System.out.println("Position " + l + ", " + c+ ":");
					
					if(c>0) {
						System.out.println("Left: "+ matriz[l][c-1]);
					}
					
					if(l > 0) {
						System.out.println("Up: "+ matriz[l-1][c]);
					}
					
					if(c < matriz[l].length-1) {
						System.out.println("Right: "+ matriz[l][c+1]);
					}
					
					if (l < matriz.length-1) {
						System.out.println("Down: " + matriz[l+1][c]);
					}
				}
			}
		}
		sc.close();
	}
}
