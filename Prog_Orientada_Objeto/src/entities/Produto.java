package entities;

public class Produto {
	 
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {//Para diferenciar o atributo do parametro onde os dois tem o mesmo nome, usa-se esse comando:
		//Este comando - this. - irá chamar o atributo da classe 
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) { 
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total $ "
				+ String.format("%.2f", totalValueInStock());
				
	}
}
	
