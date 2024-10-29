import java.util.Scanner;

public class entradaDeDadosPT2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine(); //Este comando é para evitar que o nextLine consuma uma linha e deixe 
		//pendente uma entrada de dado por conta de se juntar com outros tipos de entradas de dados
		
		s1 = sc.nextLine(); //comando para ler até a quebra de linha
		s2 = sc.nextLine(); 
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
