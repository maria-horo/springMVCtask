package que5;
//5. Create a program to add Student elements to arraylist object and display the 
//   elements using for loop and Iterator interface

public class Student {
	int rollNo;
	String name;
	
	Student(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "NAME: "+name+"  ROLL No.- "+rollNo;
	}
}
