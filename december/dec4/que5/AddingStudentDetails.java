package que5;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class AddingStudentDetails {
	void studentTreeset() {
		
		Set<Student> treeset = new TreeSet<Student>();
		treeset.add(new Student(101, "jimmy"));
		treeset.add(new Student(203, "tom"));
		treeset.add(new Student(36, "jerry"));
		treeset.add(new Student(101,"tom"));
		treeset.add(new Student(36, "jerry"));
		Iterator<Student> iterator = treeset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
