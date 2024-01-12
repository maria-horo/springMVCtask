package que4_5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesMain {

	public static void main(String[] args) {
		List<Employees> list = new ArrayList<Employees>();
		list.add(new Employees(456, "Troy", 5000));
		list.add(new Employees(789, "Hannah Montana", 11000));
		list.add(new Employees(123, "Doraemon", 9500));
		list.add(new Employees(56, "pikachu", 15000));
		list.add(new Employees(12, "alex", 6600));

		List<Employees> l = list.stream().filter(employees -> employees.getSalary() > 10000).collect(Collectors.toList());
		System.out.println("Employees with salary greater than 10000:");
		l.forEach(employees -> System.out.println(employees.getSalary()));

		double maxSalary = list.stream().mapToDouble(Employees::getSalary).max().orElse(0);
		double minSalary = list.stream().mapToDouble(Employees::getSalary).min().orElse(0);
		System.out.println("Maximum salary: "+maxSalary);
		System.out.println("Minimum salary: "+minSalary);
	}

}
