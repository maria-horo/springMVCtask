package que3;
//3. Write a program to get key and values at a time from HasMap.

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	void keyAndValues() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(9, null);
		map.put(3, "pink");
		map.put(7, "yellow");
		map.put(null, null);
		map.put(5, "black");
		map.put(6, "blue");
		map.put(2, "green");
		for (Map.Entry<Integer,String> entry : map.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
	}
}
