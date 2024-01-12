package activity;

import java.util.Comparator;

public class CompareByAge implements Comparator<Student> {
	
	@Override
	public int compare(Student s1, Student s2) {
		return s1.age - s2.age;
	}
}
