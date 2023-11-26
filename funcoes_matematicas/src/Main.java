
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 3.0, y = 4.0, z = -5.0;
		double a, b, c;
		
		// Math.sqrt = Raiz quadrada
		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);
		
		System.out.println("=-=".repeat(10));
		System.out.println("Raiz quadrada de " + x + " = " + a);
		System.out.println("Raiz quadrada de " + y + " = " + b);
		System.out.println("Raiz quadrada de 25 = " + c);
		System.out.println("=-=".repeat(10));
		
		// Math.pow = Exponenciação, valor x elevado a y
		a = Math.pow(x, y);
		b = Math.pow(x, 2.0);
		c = Math.pow(5.0,  2.0);
		
		System.out.println(x + " elevado a " + y + " = " + a);
		System.out.println(x + " elevado ao quadrado = " + b);
		System.out.println("5 elevado ao quadrado = " + c);
		System.out.println("=-=".repeat(10));
		
		// Math.abs = Valor absoluto (valor positivo, apenas se for negativo)
		a = Math.abs(y);
		b = Math.abs(z);
		
		System.out.println("o valor absoluto de " + y + " = " + a);
		System.out.println("O valor absoluto de " + z + " = " + b);
		System.out.println("=-=".repeat(10));

	}

}
