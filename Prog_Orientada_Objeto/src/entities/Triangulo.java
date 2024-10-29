package entities;
   //ABAIXO: Classe criada para diminuir o Program_Triang, deixa-lo mais organizado e facilitar a vida 
public class Triangulo { //<- Nome da Classe

	//ABAIXO: Atributos da classe
	public double a;
	public double b;
	public double c;
	
	//ABAIXO: Metodo criado para calcular o triangulo
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
