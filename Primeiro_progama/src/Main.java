import java.util.Locale; //comando usado para mudar de localização

public class Main {

	public static void main(String[] args) {
		int soma;
		double x = 10.10000;
		
		soma = 5 + 1;
		System.out.printf("%.2f%n", x);
		System.out.println(soma);
		System.out.println("Olá mundo");
		Locale.setDefault(Locale.US); //comando usado para mudar de localizão
		System.out.println();
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado: " + x + " Metros."); //comando (+) usado para concatenar
		System.out.printf("Resultado: %.2f metros%n", x);
		
		String nome = "Maria";
		int idade = 30;
		double renda = 4.500;
		
		System.out.printf("%s tem %d anos de idade e rerebe um salário de R$ %.4f%n", nome, idade, renda);
		System.out.println();
		
		int a = 5, b = 2;
		double resultado;
		
		resultado = (double) a / b; //converção explícita dos valores ou mais conhecido como casting
		
		System.out.printf("O resultado é: %.1f%n", resultado);
	
	}

}
