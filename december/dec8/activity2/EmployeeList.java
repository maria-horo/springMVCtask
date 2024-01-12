package activity2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(101, "blossom", 50000));
		l.add(new Employee(802, "lara", 80000));
		l.add(new Employee(456, "lara", 15000));
		l.add(new Employee(78, "muffin", 85000));
		l.add(new Employee(654, "clara", 100000));
		Comparator<Employee> c =( e1,  e2)-> {
			return e1.name.compareTo(e2.name);
		};
		Collections.sort(l, c);
		for(Employee e : l) {
			System.out.println(e);
		}
	}

}
