import java.util.Scanner;

public class funcoesSitaxe_de_Java {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c); //Funcao para indicar qual dos numeros é o maior
		
		showResult(higher); //Funcao que vai simplesmente imprimir a mensagem na tela, sem reaproveitamento, sendo assim, o
							// tipo que ela retorna é vazio -> VOID
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) { //Não precisa se preocupar com o nome das variaveis, pois os valores vão ser os mesmos
		int aux;								// É assim que se declara uma função em Java
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux; //Para retornar o valor
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
