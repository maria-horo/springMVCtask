package que1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//1. Write a program to show the behavior of HashMap using different
//   ways of iterations

public class HashmapIterations {
	void waysOfIterations() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(9, null);
		map.put(3, "pink");
		map.put(null, "yellow");
		map.put(null, null);
		map.put(5, "black");
		map.put(6, "blue");
		map.put(2, "green");
		
		//I
		map.forEach((k,v)
				->System.out.println(k+" : "+(v)));
		System.out.println();
		
		//II
		for (Map.Entry<Integer,String> entry : map.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
		System.out.println();
		
		//III
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) { 
             Map.Entry<Integer, String> entry = itr.next(); 
             System.out.println("Key = " + entry.getKey() +  
                                 ", Value = " + entry.getValue()); 
        } 
		System.out.println();
		
		//IV
		System.out.println(map);
	}
}
