import java.util.Scanner;

public class ex_o4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercicío 04
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();		
		int duracao;
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaFinal + horaInicial;
		}
		
		System.out.printf("O jogo durou %d hora(s).", duracao);
		sc.close();
	}
}
