package application;

import java.util.Locale;
import java.util.Scanner;
import util.MembrosEstat;

public class Classes_abstratas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = MembrosEstat.circunferenc(radius);
		
		double v = MembrosEstat.volume(radius);
		
		System.out.printf("Circunferenc: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", MembrosEstat.PI);
		
		sc.close();
	}
		
}
