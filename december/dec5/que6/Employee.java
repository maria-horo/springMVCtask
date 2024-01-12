package que6;
//6. Write program sort the Employee elements based on name or 
//   location from ArrayList

public class Employee {
	private String location;
	private String name;
	Employee(String location, String name){
		this.location = location;
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLoc(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Employee Location: "+location+"  Name: "+name;
	}
}
