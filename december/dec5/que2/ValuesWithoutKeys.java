package que2;
//2. Write a program to get values from HashMap without using keys.

import java.util.HashMap;
import java.util.Map;

public class ValuesWithoutKeys {
	void withoutUsingKeys() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(9, null);
		map.put(3, "pink");
		map.put(7, "yellow");
		map.put(null, null);
		map.put(5, "black");
		map.put(6, "blue");
		map.put(2, "green");
		
		for (Map.Entry<Integer,String> entry : map.entrySet())  
            System.out.println("Value = " + entry.getValue()); 
	}
}
