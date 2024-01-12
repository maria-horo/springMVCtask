package nov21_que3;
//3. Overload functions (static polymorphism) in a class and access
//   them using the class object. And also show the advantage of 
//   using overloading concept.


public class Calculator1 {
	
	void addition(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	void addition(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
}
