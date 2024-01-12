package que1;
//WAP to add primitive data type elements to a hashset object and display the elements

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PrimitiveAndHashset {
	public void collection() {
		Set <Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(63);
		set.add(null);
		set.add(null);
		//Hashset allow only 1 null, no exception
		set.add(45);
		set.add(5);
		System.out.println(set);
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
