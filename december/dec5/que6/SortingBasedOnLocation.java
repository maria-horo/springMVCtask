package que6;

import java.util.Comparator;

public class SortingBasedOnLocation implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getLocation().compareTo(e2.getLocation());
	}

}
