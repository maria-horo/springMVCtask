package que6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//6. Show the difference between ArrayList and Vector and LinkedList.

public class ListDifference {
	void arraylist() {
		List<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(33);
	    myNumbers.add(15);
	    myNumbers.add(8);
	    myNumbers.add(33);
	    myNumbers.add(8);
	    System.out.println(myNumbers);	
	    System.out.println("Size of ArrayList: " + myNumbers.size());
	    //adding, updating, removing
	    myNumbers.add(12);
	    myNumbers.set(0, 5);
	    myNumbers.remove(3);
	    System.out.println("ArrayList Elements after operations: " + myNumbers);
	    System.out.println();
	}
	
	void linkedlist() {
		List<Integer> myNumbers = new LinkedList<Integer>();
		myNumbers.add(33);
	    myNumbers.add(15);
	    myNumbers.add(8);
	    myNumbers.add(33);
	    myNumbers.add(8);
	    System.out.println(myNumbers);	
	    System.out.println("Size of ArrayList: " + myNumbers.size());
	  //adding, updating, removing
	    myNumbers.add(12);
	    myNumbers.set(0, 5);
	    myNumbers.remove(3);
	    System.out.println("ArrayList Elements after operations: " + myNumbers);
	    System.out.println();
	}
	
	void vector() {
		List<Integer> myNumbers = new Vector<Integer>();
		myNumbers.add(33);
	    myNumbers.add(15);
	    myNumbers.add(8);
	    myNumbers.add(33);
	    myNumbers.add(8);
	    System.out.println(myNumbers);
	    System.out.println("Size of ArrayList: " + myNumbers.size());
	  //adding, updating, removing
	    myNumbers.add(12);
	    myNumbers.set(0, 5);
	    myNumbers.remove(3);
	    System.out.println("ArrayList Elements after operations: " + myNumbers);
	    System.out.println();
	}
}
