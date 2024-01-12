package nov22_case4;
//Case 4: If SuperClass declares an exception and SubClass declares a child exception
//        of the SuperClass declared Exception.


public class Parent {
	void method() throws Exception {
		System.out.println("parent method");
	}
	
	/*
	 * If superclass declares "Exception" and subclass declares RuntimeException
	 * -----it works
	 */
}
