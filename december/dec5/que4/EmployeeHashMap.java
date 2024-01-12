package que4;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap {
	void employeeObjectAsKey() {
		Map<Employee, Integer> map = new HashMap<Employee, Integer>();
		map.put(new Employee(456, "Troy"), 3);
		map.put(new Employee(789, "Hannah Montana"), 1);
		map.put(new Employee(123, "Doraemon"), 2);
		for(Map.Entry<Employee, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey());
		}
	}
}
