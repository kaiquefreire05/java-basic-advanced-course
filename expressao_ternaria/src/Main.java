
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Condição if e else normal
		
		double preco = 34.5;
		double desconto;
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}
		
		// Expressão condicional ternária
		
		double precot = 34.5;
		double descontot = (precot < 20.0) ? precot * 0.1 : precot * 0.05;
		
		// 					CONDICAO		CONDI V       CONDI F
		
		System.out.println(desconto); // Mesmos valores, qtde de linhas diferentes
		System.out.println(descontot);
	}
}
