
public class funcoesP_Strings {

	public static void main(String[] args) {
		
		String original = "abcd EFGH ilkl bc ";
		
		String s01 = original.toLowerCase(); //Funcao para imprimir tudo minusculo
		String s02 = original.toUpperCase(); //Funcao para imprimir tudo maiusculo
		String s03 = original.trim(); //Funcao para imprimir sem espaçamento
		String s04 = original.substring(2); //Funcao para imprimir da posicao indicada nos parenteses
											// à diante
		
		String s05 = original.substring(2, 9); //Funcao para imprimir da posicao indicada nos parenteses,
											   // mas agora com limite, também indicado nos parenteses.
		
		String s06 = original.replace('a', 'x'); //Funcao para trocar valores, por exemplo: Sempre que
												// ele encontrar um a, ele o trocará por x. Ela também
												// serve para substrings
		
		int i = original.indexOf("bc"); //Consultar qual a posicao em que a variavel indicado no ()
										// aparece pela primeira vez
		int j = original.lastIndexOf("bc"); //Consultar qual a posicao que a variarel indicada no ()
											// aparece pela última vez
		
		System.out.println("Original: - " + original + "-");
		System.out.println("toLowerCase: - " + s01 + "-");
		System.out.println("toUpperCase: - " + s02 + "-");
		System.out.println("trim: - " + s03 + "-");
		System.out.println("substring(2): - " + s04 + "-");
		System.out.println("substring(2, 9): - " + s05 + "-");
		System.out.println("replace('a', 'x'): - " + s06 + "-");
		System.out.println("index Of: - " + i + "-");
		System.out.println("last Index Of: - " + j + "-");
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" "); //Funcao para separar palavras em vetores
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}
