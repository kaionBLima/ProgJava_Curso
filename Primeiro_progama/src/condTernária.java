import java.util.Scanner;

public class condTernária {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05; //Se o preço for menor que 20, entao multiplique por 0.1
																	  // se el não for menor que 20, então multique por 0.05
		
		System.out.printf("%.2f", desconto);
		
		sc.close();
	}

}
