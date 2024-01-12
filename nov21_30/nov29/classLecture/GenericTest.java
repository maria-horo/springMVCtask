package classLecture;

import java.util.ArrayList;

public class GenericTest {
	private void display(ArrayList<Integer> list) {
		for(Object obj : list) {
			Integer value = (Integer)obj;
			System.out.println(value);
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(200);
		list.add(50);
		System.out.println(list);

		GenericTest test = new GenericTest();
		test.display(list);
	}
}
