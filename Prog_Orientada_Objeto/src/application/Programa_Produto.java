package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class Programa_Produto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		// ABAIXO: Para armazenar o produto/dado digitado, usa-se esse comando:
		produto.name = sc.nextLine();
		System.out.print("Price: ");
		produto.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		produto.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Produto: " + produto);
		
		System.out.println();
		System.out.println("Enter the number of products to be added is stock: ");
		int quantity = sc.nextInt();
		//ABAIXO: Comando que faz a atualização do dado guardado anteriormente:
		produto.addProducts(quantity);
		
		System.out.println();
		System.out.println("Uptade data: " + produto);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed is stock: ");
		quantity = sc.nextInt();
		//ABAIXO: Comando para remover dado adicionado recentemente
		produto.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Uptade data: " + produto);
		
		sc.close();
	}

}
