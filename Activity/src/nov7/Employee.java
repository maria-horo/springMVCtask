package nov7;

public class Employee {

	static int basicSalary = 30000; //static variable
	int bonus = 10000;//non static variable
	
	void work() {
		int time=9; //local variable
		System.out.println("Work time of an employee is "+time+" hours.");
	}
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		System.out.println("Total salary of an employee:");
		int TotalSalary = basicSalary + employee.bonus;
		System.out.println(TotalSalary);
		employee.work();

	}
}
