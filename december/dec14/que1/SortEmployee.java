package que1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployee {

	public static void main(String[] args) {
		 List<String> names = Arrays.asList(
	                "Bond",
	                "James",
	                "Einstein",
	                "Alice",
	                "Whitman",
	                "Bob",
	                "Binny",
	                "Spider",
	                "Lee",
	                "Anderson");
	 	
		List<String> l = names.stream().sorted((e1, e2) -> (e1.length() - e2.length()))
				         .collect(Collectors.toList());
		System.out.println(l);
	}
}
