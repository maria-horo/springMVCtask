package que1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//1. Create a list of names and find the number of records using streams

public class ListOfNames {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("leo");
		list.add("lara");
		list.add("dora");
		list.add("candy");
		long count = list.stream().count();
		System.out.println("No. of records: "+count);
		
//		Stream<String>s = list.stream();
//		s.forEach(i -> System.out.println(i));
//		s.filter(i -> i.equals("dora"));
//		IllegalStateException - stream has already been operated upon or closed.	
	}
}
