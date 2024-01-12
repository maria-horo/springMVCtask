package que7;
// WAP to show difference between Iterator & Enumeration

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Iterator_Enumeration {
	void difference() {
		List<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		Iterator<String> iterator = cars.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();

		Vector<Integer> vecObject = new Vector<Integer>();   
		vecObject.add(11);  
		vecObject.add(22);  
		vecObject.add(33);                  
		Enumeration<Integer> enumobject = vecObject.elements();   
		while (enumobject.hasMoreElements()) {             
			System.out.println(enumobject.nextElement());  
		}  
	}
}
