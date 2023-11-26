package entities;

public class Employees {
	
	private Integer id;
	private String name;
	private Double salary;
	
	// Funções do objeto
		@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

	public void increaseSalary(double percent) {
		salary += salary * percent / 100.0; // Como vou acessar um membro da classe não precisa do this.
	}
	// Construtor
	
	public Employees(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Getters e Setters
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
