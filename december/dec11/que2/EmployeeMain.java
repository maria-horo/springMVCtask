package que2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {
		public static void main(String[] args) {
			List<Employees> list = new ArrayList<Employees>();
			list.add(new Employees(456, "Troy"));
			list.add(new Employees(789, "Hannah Montana"));
			list.add(new Employees(123, "Doraemon"));
			
			Collections.sort(list, Comparator.comparingInt(Employees::getId));
			for(Employees emp : list) {
				System.out.println(emp.getId()+"  "+emp.getName());
			}
	}

}
