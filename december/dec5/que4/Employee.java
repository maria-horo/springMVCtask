package que4;
//4. Write a program to use Employee object as a key in the HashMap.

public class Employee {
	private int id;
	private String name;
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
