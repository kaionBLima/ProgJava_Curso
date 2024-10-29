package entities;

public class MetConstrutorProduto {
	 
	//Usando encapsulamento 
	
	private String name;
	private double price;
	private int quantity;
	
	//É possível incluir um construtor padrão sem precisar passar parâmetros dessa forma:
	
	public MetConstrutorProduto() {
		
	}
	
	//AQUI ESTAMOS TRABALHANDO COM CONSTRUTUTOR E SOBRECARGA DE CONSTRUTORES
	//Aqui é um Construtor personalizado:
	
	public MetConstrutorProduto(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	/*Construtor sobrecarregado se usa para disponibilizar mais de uma versão da mesma operação, neste exemplo 
	  usamos ele para começar o valor em 0, a diferença em cada um é a quantidade de parâmetros */
	
	public MetConstrutorProduto(String name, double price) {
		this.name = name;
		this.price = price;
		/* this.quantity = 0; É opcional colocar o parâmeto "quantity" e o seu "this", pois como este construtor não tem esse
		   parâmetro dentro da dos (), logo não é obrigatório */
	}
	//Método para obter e registrar o valor 'Setado'
	public String getName() {
		return name;
	}
	//Método utilizado para alterar os dados registrados
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	/*Iremos usar apenas o get, pois é preciso manter a integridade e manter a consistencia desse dado que irá mudar 
	 apenas quando entrar ou sair algum produto*/
	public int getQuantity() {
		return quantity;
	}
	
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
	
