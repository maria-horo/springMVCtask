package que2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStream {

	public static void main(String[] args) {
		List<Employees> list = new ArrayList<Employees>();
		list.add(new Employees(456, "Troy"));
		list.add(new Employees(789, "Hannah Montana"));
		list.add(new Employees(123, "Doraemon"));
		list.stream().forEach(System.out::println);
	}

}
