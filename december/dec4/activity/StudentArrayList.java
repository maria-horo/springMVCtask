package activity;

import java.util.ArrayList;
import java.util.List;

public class StudentArrayList {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(5);
		l.add('k');
		l.add("core nuts");
		l.add(6);
		l.add(10, 56);
		int sum = 0;
//		for(Object o : l) {
//			if(o instanceof Integer) {
//				sum = sum +(int) o;
//			}
//		}
//		System.out.println(sum);
		System.out.println(l);
	}
}
