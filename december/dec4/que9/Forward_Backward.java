package que9;
//9. Write a program to print list elements in forward and backward 
//   direction

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Forward_Backward {
	void addingElements(){
		List<Object> list = new ArrayList<Object>();
		list.add("anna");
		list.add(47);
		list.add(null);
		list.add(5.9999);
		list.add(false);
		list.add('f');
		ListIterator<Object> litr = list.listIterator();
		System.out.println("Iterating forward direction:");
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println();
		System.out.println("Iterating backward direction:");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}
}
