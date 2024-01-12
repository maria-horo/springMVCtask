package que2;

//2. WAJP to implement a lambda expression to sort a list of objects based on specific 
//   attribute

public class Employees {
	private int id;
	private String name;
	
	Employees(int id, String name){
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

