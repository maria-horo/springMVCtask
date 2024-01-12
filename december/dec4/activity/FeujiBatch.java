package activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class FeujiBatch {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(22);
		l1.add(4);
		l1.add(3);
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(22);
		l2.add(44);
		l2.add(33);
		l1.addAll(l2);
		System.out.println(l1);
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(l1);
//		for(Integer integer : l1) {
//
//		}
		//		Set<Integer> key = map.keySet();
		//		for(Integer i : key) {
		//			System.out.println();
		//		}
	}

}
