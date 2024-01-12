package que7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EmployeeHashMap {
	void sorting() {
		Map<Employee, Integer> map = new HashMap<Employee,Integer>();
		map.put(new Employee("chennai", "scooby"), 12);
		map.put(new Employee("bangalore", "super mario"), 3);
		map.put(new Employee("pune", "maggie"), 5);
		map.put(new Employee("delhi", "hathodi"), 2);
		
		System.out.println("Before Sorting:");  
		Set set = map.entrySet();  
		Iterator<Employee> iterator = set.iterator();  
		while(iterator.hasNext()) {  
		Map.Entry entry = (Map.Entry) iterator.next();  
		System.out.println(entry.getKey());  
		} 
		
		System.out.println("After Sorting");
		
	}
}
