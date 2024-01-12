package activity;

import java.util.Set;
import java.util.TreeSet;

public class TreesetClass {
	void comparingUsingComparator(){
		CompareByName c1 = new CompareByName();
		CompareByAge c2 = new CompareByAge();
		CompareById c3 = new CompareById();
		Set<Student> ts = new TreeSet<Student>(c1);
		ts.add(new Student(101, "jimmy", 14));
		ts.add(new Student(203, "tom", 15));
		ts.add(new Student(36, "jerry", 12));
		ts.add(new Student(101,"tom", 11));
		ts.add(new Student(36, "jerry", 17));
		//System.out.println(ts);
		for(Student s : ts) {
			System.out.println(s);
		}
	}
}
