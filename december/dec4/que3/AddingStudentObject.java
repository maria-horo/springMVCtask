package que3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AddingStudentObject {
	void studentHashset() {
		Set<Student> hashset = new HashSet<Student>();
		hashset.add(new Student(101, "jimmy"));
		hashset.add(new Student(203, "tom"));
		hashset.add(new Student(36, "jerry"));
		hashset.add(new Student(101,"tom"));
		hashset.add(new Student(36, "jerry"));
		//System.out.println(hs);
		Iterator<Student> iterator = hashset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
