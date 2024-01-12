package classLecture;

public class Person implements Comparable {
	String name;
	int marks;

	Person(String name, int marks){
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int compareTo(Object o) {
		if(marks==o.marks) {   
			return 0;  
		}
		else if(marks<o.marks) {    
			return 1; 
		}
		else { 
			return -1; 
		}
	}    
}
