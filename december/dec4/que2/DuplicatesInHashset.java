package que2;
//WAP to add duplicate elements to a hashset object and confirm what exception will throw

import java.util.HashSet;

public class DuplicatesInHashset {
	void addingDuplicates(){
		HashSet<String> hashset= new HashSet<String>();
		hashset.add("apple");
		hashset.add("mango");
		hashset.add("guava");
		hashset.add("mango");
		hashset.add("guava");
		hashset.add("pineapple");
		System.out.println(hashset);
		//There's no exception or error while adding duplicate elements
	}
}
