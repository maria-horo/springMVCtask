package nov22_case5;

import java.io.IOException;

//Case 5: If SuperClass declares an exception and SubClass declares without exception.

public class Parent {
	public void method() throws IOException {
		System.out.println("parent method");
	}
	//----works
}
