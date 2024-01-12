package que5;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentDetails {
	void addingStudDet(){
		Student student1 = new Student(45, "naruto");
		Student student2 = new Student(12, "kakashi");
		Student student3 = new Student(5, "sasuke");
		Student student4 = new Student(12, "kabuto");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		//System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}