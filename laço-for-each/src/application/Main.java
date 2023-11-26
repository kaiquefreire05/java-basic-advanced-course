package application;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] vect = new String[] {"Maria", "Kaique", "Alex"};
		
		// Método sem for each
		for(int i=0;i<vect.length;i++) {
			System.out.println(vect[i]);
		}
		System.out.println("Acabou");
		
		// Com for each
		// Para cada objeto n em vect, faça: (Forma de ler esse comando)
		for (String n : vect) {
			System.out.println(n);
		}
		System.out.println("Acabou");
		
	}
}
