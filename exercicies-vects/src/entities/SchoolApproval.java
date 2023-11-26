package entities;

public class SchoolApproval {
	private String name;
	private double n1;
	private double n2;
	
	
	// CONSTRUTORES 
	
	public SchoolApproval(String name, double n1, double n2) {
		super();
		this.name = name;
		this.n1 = n1;
		this.n2 = n2;
	}
	
	// GETTERS  E SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	// FUNÇÕES DO OBJETO
	
	public boolean isAprovado() {
        double media = (n1 + n2) / 2.0;
        return media >= 6.0; // Comparar com o limite de aprovação desejado
    }
	
}
