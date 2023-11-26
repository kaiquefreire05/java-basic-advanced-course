package entities;

public class Employee {
	public String Name; // Nome
	public double GlossSalary; // Salário Bruto
	public double Tax; // Imposto

	public double NetSalary() { // Método Salário líquido
		return GlossSalary - Tax;
	}

	// Void não retorna nenhum valor mas executa uma ação ou resultado.
	public void IncreaseSalary(double p_porcent) {
		GlossSalary += GlossSalary * (p_porcent / 100);
	}
	
	public String toString(){
		return Name + ", $ " + String.format("%.2f", NetSalary());
	}
}
