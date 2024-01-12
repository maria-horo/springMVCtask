package que10;
//10. Write a program to add all elements of a list to array List 
//    and get sub list from a List

import java.util.ArrayList;
import java.util.List;

public class GettingSubList {
	void sub() {
		List<String> list = new ArrayList<String>();
		list.add("anna");
		list.add("ada");
		list.add("chhamakchhallo");
		list.add("popsicle");
		list.add("muffin");
		list.add("lara");
		System.out.println("My arrayList: "+ list);
		List<String> list2 = list.subList(2, 5);
		System.out.println("My subList: "+ list2);
	}
}
