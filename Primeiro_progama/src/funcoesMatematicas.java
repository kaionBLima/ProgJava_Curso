
public class funcoesMatematicas {

	public static void main(String[] args) {
		
		double y = 3.0, x = 4.0, z = 5.0;
		double A, B, C;
		
		A = Math.sqrt(x); //comando que faz a raiz quadrada de um numero
		B = Math.sqrt(y);
		C = Math.sqrt(36.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 " + C);
		
		A = Math.pow(x, y); //comando que faz potenciação
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado a 2.0 = " + B);
		System.out.println("5 elevado a 2 = " + C);
		
		A = Math.abs(y); //comando que recebe e imprime valor absoluto
		B = Math.abs(x);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + x + " = " + B);
	}

}
