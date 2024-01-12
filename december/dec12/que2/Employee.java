package que2;
//2. Create a list of employees and print all records using streams

public class Employee {
	int id;
	String name;
	Employee(int id, String name){
		this.id = id;
		this.name = name;
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
	public String toString() {
		return "Employee ID: "+id+"  Name: "+name;
	}
}
