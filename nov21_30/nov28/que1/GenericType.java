package que1;

import java.util.ArrayList;

//1. Write a program to show advantage of using generics.
//   Show the problem and give the solution for that using generic concept.


public class GenericType {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("tom");
		list1.add(0.3f);
		list1.add(566745l);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("jerry");
		list2.add("bravo");
		//list2.add(25);
		
		System.out.println(list1);
		System.out.println(list2);
		
		String s = (String) list1.get(0); //typecasting
		String str = list2.get(0);
	}
}
