package que7;

//7. Write a program to convert primitive to wrapper class and wrapper to primitive.

public class AutoBoxing {
	void converting() {
		//Autoboxing
		int num = 110;
		Integer n = new Integer(num);
		System.out.println(n);

		//Unboxing
		Integer integer = new Integer(10);
		int primitiveInt = integer.intValue();
		System.out.println("Primitive int value: " + primitiveInt);
	}
}
