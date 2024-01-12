package que6;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentName {

	void usingHashSet() {
		Set<Student> hashset = new HashSet<Student>();
		hashset.add(new Student("jimmy"));
		hashset.add(new Student("tom"));
		hashset.add(new Student("jerry"));
		hashset.add(new Student("tom"));
		hashset.add(new Student("jerry"));
		for(Student student : hashset) {
			System.out.println(student);
		}
		System.out.println();
	}
	void usingTreeSet() {
		Set<Student> treeset = new TreeSet<Student>();
		treeset.add(new Student("jimmy"));
		treeset.add(new Student("tom"));
		treeset.add(new Student("jerry"));
		treeset.add(new Student("tom"));
		treeset.add(new Student("jerry"));
		for(Student student : treeset) {
			System.out.println(student);
		}
	}
}
