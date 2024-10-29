import java.util.Scanner;

public class estrutura_de_Repeticao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 int hora = sc.nextInt();
		 
		 if (hora < 12 && hora >= 0) {
			 System.out.printf("Bom dia!");
		 }
		 else if (hora >= 12 && hora < 18) {
			 System.out.printf("Boa tarde!");
		 }
		 else {
			 if (hora >= 18 && hora <= 23) {
				 System.out.printf("Boa noite!");
			 }
			 else {
				 System.out.printf("Não sei que horas são!");
			 }
		 }
		
		sc.close();
	}

}
