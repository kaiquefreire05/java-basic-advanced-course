package entities;

public class Product {
	public String name;
	public double price;
	public int quantity; // Quantidade
	
	public double totalValueInStock() { // Calcular valor total
		return price * quantity; // Usando variáveis da classe
	}
	
	public void addProducts(int quantity) { // Adicionar produtos
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) { // Remover a qtde de produtos
		this.quantity -= quantity; // this.quantity, seria a variável da classe não parâmetro.
	}
	
	public String toString() { // Método para printar
		return name + ", $ " + String.format("%.2f", price) + ", "
	+ quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
		
	}
}
