package que8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentDetails {
	public static void main(String[] args) {
	
		Student student1 = new Student(45, "naruto");
		Student student2 = new Student(12, "kakashi");
		Student student3 = new Student(5, "sasuke");
		Student student4 = new Student(12, "kabuto");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		
		System.out.println("Sorting using Comparable interface");
		Collections.sort(list);
		Iterator<Student> iterator1 = list.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		System.out.println("----------------------------------");
		System.out.println();
		System.out.println("Sorting using Comparator interface");
		Collections.sort(list, new SortByName());
		Iterator<Student> iterator2 = list.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
