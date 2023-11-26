package entities;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private Double salary;
	
	// construtores
	
	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	// getters e setters
	
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
	
	// comparable 
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName()); // assim ele coloca em ordem alfabética
		//return -salary.compareTo(o.getSalary()); // assim ele ordena o salario em ordem decrescente
		// se tirar o -, ele fica em ordem crescente
	}
	
	
}
