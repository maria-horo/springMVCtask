package que6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeArrayList {
	void sorting(){
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("chennai", "scooby"));
		list.add(new Employee("bangalore", "super mario"));
		list.add(new Employee("chennai", "maggie"));

		Collections.sort(list, new SortingBasedOnName());

		Iterator<Employee> iterator1 = list.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		System.out.println();

		Collections.sort(list, new SortingBasedOnLocation());

		Iterator<Employee> iterator2 = list.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
