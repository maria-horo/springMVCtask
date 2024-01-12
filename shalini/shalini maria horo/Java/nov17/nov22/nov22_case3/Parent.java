package nov22_case3;
////Case 3: If SuperClass declares an exception and SubClass declares exceptions
//          other than the child exception of the SuperClass declared Exception.

import java.io.IOException;
import java.sql.SQLException;

public class Parent {
	void method() throws SQLException {
		System.out.println("parent method");
	}
	/*
	 * if parent-child = unchecked, WORKS
	 * if parent-child = checked, ERROR
	 * parent-unchecked, child-checked, ERROR
	 * parent-checked, child-unchecked, WORKS
	 * 
	 * parent-"Exception", child-"IOException", WORKS
	 * parent-IOException, child-"Exception", ERROR
	 */
}
