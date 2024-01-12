package que1;
//1. Write a program to convert an array to collection

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToCollection {
	void arrayAsCollection() {
		int[] array = {56, 58, 45, 8, 100, 39};
		System.out.println(Arrays.toString(array));
		
		List newArrayObject = Arrays.asList(Arrays.toString(array));
		for(Object obj : newArrayObject) {
			System.out.println(obj);
		}	
	}
}
