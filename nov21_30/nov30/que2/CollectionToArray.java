package que2;

import java.util.ArrayList;
import java.util.List;

//2. Write a program to convert a collection to an array

public class CollectionToArray {
	void convertingArray() {
		List<String> list = new ArrayList<String>();
		list.add("dora");
		list.add("candy");
		list.add("leo");
		
		String[] str = list.toArray(new String[0]);
		for(String string : str) {
			System.out.println(string);
		}
	}
}
