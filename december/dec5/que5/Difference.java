package que5;
//5. Write a program to show the difference between HashMap and Hashtable 
//   and LinkedHashMap.

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Difference {
	void hashMap() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(9, null);
		map.put(3, "pink");
		map.put(null, "yellow");
		map.put(null, null);
		map.put(5, "black");
		map.put(6, "blue");
		map.put(2, "green");
		System.out.println(map);
		//doesn't maintains the insertion order
	}
	void hashTable() {
		Map<Integer, String> map = new Hashtable<Integer, String>();
		map.put(9, "magenta");
		map.put(3, "pink");
		map.put(10, "yellow");
		map.put(1, "orange");
		map.put(5, "black");
		map.put(6, "blue");
		map.put(2, "green");
		System.out.println(map);
		//hashtable doesn't allow null key and value.
	}
	void linkedHashMap(){
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(9, null);
		map.put(3, "pink");
		map.put(null, "yellow");
		map.put(null, null);
		map.put(5, "black");
		map.put(6, "blue");
		map.put(2, "green");
		System.out.println(map);
		//maintains the insertion order
	}
}
