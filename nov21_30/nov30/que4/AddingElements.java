package que4;
//4. Create a program to add primitive data type elements to arraylist object and
//   display the elements using for loop and Iterator interface.

import java.util.ArrayList;
import java.util.Iterator;

public class AddingElements {
	void iterating() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(45);
		list.add(89);
		list.add(null);
		list.add(0);
		list.add(10);
		Iterator<Integer> itr = list.iterator();
		//using iterator interface
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//using for loop
		for(int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
	}	
}
