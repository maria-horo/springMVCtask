package que12;
//12. Write convert from primitive data type values to string.

public class PrimitiveToString {
	void method() {
		int value1 = 28;
		char value2 = 'k';
		float value3 = 5.6f;
		double value4 = 56.987;
		
		String s1 = String.valueOf(value1);
		String s2 = String.valueOf(value2);
		String s3 = String.valueOf(value3);
		String s4 = String.valueOf(value4);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
