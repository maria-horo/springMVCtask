package que3;
//3. Write a program to print a collection

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintingCollection {
	void print() {
		List list = new ArrayList();
		Iterator itr = null;
		list.add("shishimanu");
		list.add(0);
		list.add('k');
		list.add(true);
		list.add(0.3f);
		//list.add(new int[] {4,5,6}.toString());

		System.out.println(list);
//		itr = list.iterator();
//		System.out.println("unidirectional");
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		for(Object obj=0; obj<list.size(); obj++) {
//			System.out.println(obj);
//		} ----> not possible
//		System.out.println("bidirectional");
//		while(itr.hasPrevious()) {
//			System.out.println(""+itr.previous());
//		}
	}
}
