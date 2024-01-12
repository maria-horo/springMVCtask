package classLecture;

import java.util.ArrayList;

public class BoundedTypeClass {
	/**
	 * // UPPER BOUND
	 * 
	 * @param <T>
	 * @param person
	 * @param person2
	 */

	public void display(ArrayList<? super Integer> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}

	}

	public static void main(String[] args) {
		BoundedTypeClass klass = new BoundedTypeClass();
		klass.compare(new Person("Raju", 100), new Person("Raju", 56));

		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("Bengaluru");
		stringList.add("Hyderabad");
		stringList.add("Delhi");

		// klass.display(stringList);

		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(10);
		integerList.add(20);
		integerList.add(30);

		klass.display(integerList);

		ArrayList<Number> doubleList = new ArrayList<>();
		doubleList.add(10.1);
		doubleList.add(20.1);
		doubleList.add(30.1);

		klass.display(doubleList);
	}
}
