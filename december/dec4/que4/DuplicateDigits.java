package que4;
//4. Write a program to add primitive data type elements (duplicates) to a set
//   object and display the elements in Sort order

import java.util.Set;
import java.util.TreeSet;

public class DuplicateDigits {

	public static void main(String[] args) {
		Set<Double> set = new TreeSet<Double>();
		set.add(6.666);
		set.add(73.9);
		set.add(6.666);
		set.add(134.339);
		set.add(329.00);
		set.add(73.9);
		System.out.println(set);
	}
}
