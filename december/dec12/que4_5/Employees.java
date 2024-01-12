package que4_5;
//4. Create a new list of employees.Find whose salary is greater than 10000 
//   from the list of employee records
//5. Find the maximum and minimum salary from the employee list using streams

import java.util.Objects;

public class Employees {
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	private int id;
	private String name;
	private double salary;
	protected Employees(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Employee ID: "+id+"  Name: "+name+"  Salary: "+salary;
	}
}
