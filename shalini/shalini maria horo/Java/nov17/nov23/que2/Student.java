package que2;

public class Student extends Person{
	int rollNo;
	Student(int rollNo){
		super(null);
		this.rollNo = rollNo;
	}
	public String personInfo() {
		super.personInfo();
		return "Student ROLL NO: "+rollNo;
	}
}
