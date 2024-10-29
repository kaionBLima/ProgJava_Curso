package application;

import java.util.Locale;
import java.util.Scanner;
import entities.MetConstrutorProduto;

public class Program_UsandoConstrutor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//MetConstrutorProduto p = new MetConstrutorProduto(); Usando o método construtor padrão
	
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		// ABAIXO: Para armazenar o produto/dado digitado, usa-se esse comando:
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		//System.out.print("Quantity in stock: ");
		//int quantity = sc.nextInt();
		//MetConstrutorProduto produto = new MetConstrutorProduto(name, price, quantity);
		MetConstrutorProduto produto = new MetConstrutorProduto(name, price); //Chamando apenas com dois parâmetros para usar 
																			  // a sobrecarga
		
		//Imprmindo os comandos dos métodos Get e Set
		produto.setName("Computer");
		System.out.println("Uptade name: " + produto.getName());
		produto.setPrice(1200.00);
		System.out.println("Uptade price: " + produto.getPrice());
		
		System.out.println();
		System.out.println("Produto: " + produto);
		
		System.out.println();
		System.out.printf("Enter the number of products to be added is stock: ");
		//quantity = sc.nextInt();
		int quantity = sc.nextInt();
		
		//ABAIXO: Comando que faz a atualização do dado guardado anteriormente:
		produto.addProducts(quantity);
		
		System.out.println();
		System.out.println("Uptade data: " + produto);
		
		System.out.println();
		System.out.printf("Enter the number of products to be removed is stock: ");
		quantity = sc.nextInt();
		//ABAIXO: Comando para remover dado adicionado recentemente
		produto.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Uptade data: " + produto);
		
		sc.close();
	}

}
