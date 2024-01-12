package que2;

public class Employee extends Person {
	int employeeID;
	double salary;
	Employee(int age, char gender, int employeeID, double salary){
		super(age, gender);
		this.employeeID = employeeID;
		this.salary = salary;
	}
	public String personInfo() {
		System.out.println(super.personInfo());
		return "EmployeeID: "+employeeID+"  Salary: "+salary;
	}
}
