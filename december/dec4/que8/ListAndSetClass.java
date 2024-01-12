package que8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAndSetClass {
	void difference() {
		List<String> list = new ArrayList<String>();
		list.add("leo");
		list.add("momo");
		list.add("leo");
		System.out.println(list);
		
		Set<String> hashset = new HashSet<String>();
		hashset.add("leo");
		hashset.add("momo");
		hashset.add("leo");
		System.out.println(hashset);
	}
}
