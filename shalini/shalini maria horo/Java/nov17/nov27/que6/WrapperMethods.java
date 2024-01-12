package que6;
//6. Write a program to implement different methods of wrapper class.

public class WrapperMethods {
	void methods() {
		Integer a = 56;
		System.out.println(a.intValue());
		//Converts the value of this Number object to the specified primitive
		//data type returned
		
		Integer b = 456;
		
		System.out.println(a.compareTo(b));
		System.out.println(a.equals(b));
		System.out.println(Integer.valueOf(a));
		System.out.println(a.toString());
	}
}
