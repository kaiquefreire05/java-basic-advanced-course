
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Coamandos Strings
		
		/* Formatar: toLowerCase(), toUpperCase(), trum();
		 * Recortar: substring(inicio), substring(inicio, fim);
		 * Substituir: Replace(char, char), Replace(string, string);
		 * Buscar: IndexOf, LastIndexOF;
		 * str.split(" ")
		*/ 

		String original = "abcde FGHIJ ABC abc DEFG   ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim(); // Elimina espaços nos cantos da string
		String s04 = original.substring(2); // Ele cria uma string a partir da posição 2 da string 0, 1, 2, 3, ...
		String s05 = original.substring(2, 9); // Ele corta a string, apartir do 2 e abaixo do caracter 9
		String s06 = original.replace('a', 'x'); // Troca substring por outra
		String s07 = original.replace("abc", "xy"); // Troca String por outra
		int i = original.indexOf("bc"); // Recebe a primeira posição do valor colocado
		int j = original.lastIndexOf("bc");//  Recebe a última posição do valor colocado
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("toUpperCase: -" + s03 + "-");
		System.out.println("toUpperCase: -" + s04 + "-");
		System.out.println("toUpperCase: -" + s05 + "-");
		System.out.println("toUpperCase: -" + s06 + "-");
		System.out.println("toUpperCase: -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
		// Operador split
		System.out.println("Operador Split: ");
		String s = "potato apple lemon";
		String[] vect = s.split(" "); // Separa os elementos
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
	}
}
