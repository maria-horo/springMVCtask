package que7;
//7. Write a program to show the difference between HashSet and 
//   LinkedHashSet

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashsetAndLinkedHashset {
	void differenceHashSet_LinkedHashSet() {
		Set<String> hashset = new HashSet<String>();
		hashset.add("dora");
		hashset.add("tom");
		hashset.add("jerry");
		hashset.add("tom");
		System.out.println(hashset);
		System.out.println();

		Set<String> linkedhashset = new LinkedHashSet<String>();
		linkedhashset.add("dora");
		linkedhashset.add("tom");
		linkedhashset.add("jerry");
		linkedhashset.add("tom");
		System.out.println(linkedhashset);
		
		//in lhs insertion order is maintained
		//where as in hs insertion order is not maintained
	}
}
