package que8;
// WAP to sort an arraylist elements using Comparable, Comparator Interfaces

public class Student implements Comparable<Student> {
	private int rollNo;
	private String name;
	
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

	@Override
	public int compareTo(Student s) {
		return this.rollNo - s.rollNo;
	}
}
