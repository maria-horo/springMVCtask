package que1;
//1.Write a program to print the names of students by creating a Student class. 
//  If no name is passed while creating an object of Student class, then the name 
//  should be "Unknown", otherwise the name should be equal to the String value 
//  passed while creating object of Student class.

public class Student {
	int rollNo;
	String name;
	
	Student(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	Student(int rollNo){
		this.rollNo = rollNo;
		name = "unknown";
	}
	public String toString() {
		return "Roll no: "+rollNo+"  Name: "+name;
	}
}
