package que1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//1. List names of the students from student records using streams
//2. Write a program to  show count of male and female students from the student 
//   records using streams
//3. Write a program to list students who come under the CSE department using streams
//4. Names of the students categorized by department using streams
//5. List female students from the Mech department using streams

public class Student {
	private int rollNo;
	private String name;
	private double marks;
	private String gender;
	private String department;
	private String city;
	private String state;
	
	public Student(int rollNo, String name, double marks, String gender, String department,String city,String state) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.gender = gender;
		this.department = department;
		this.city = city;
		this.state = state;
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks +"GENDER= "+gender+" DEPARTMENT= "+department + "]";
	}
}
