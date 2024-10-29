import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //entrada de dados, é tipo o scanf da ling. C
		
		String x;
		int y;
		double z;
		char w;
		
		x = sc.next(); //comando que é tipo o scanf em c
		y = sc.nextInt();
		z = sc.nextDouble();
		w = sc.next().charAt(0);
		
		System.out.println("Você digitou: " + x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
		
		
		sc.close(); //encerrar esse recurso que foi criado
	}

}
