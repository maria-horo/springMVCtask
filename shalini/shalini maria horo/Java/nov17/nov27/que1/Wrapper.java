package que1;
//1. Write a program by utilizing all utility functions of wrapper classes and show the
//   difference from one class function to another class function

public class Wrapper {
	void integerClass() {
		
		Byte byteNum = 80;
		System.out.println("Byte Wrapper Class:");
		System.out.println("entered value is:"+byteNum);
		System.out.println("maxValue:"+Byte.MAX_VALUE);
		System.out.println("mInValue:"+Byte.MIN_VALUE);
		System.out.println();
		
		Short shortNum=98;
		System.out.println("Short Wrapper Class:");
		System.out.println("entered value is:"+shortNum);
		System.out.println("maxValue:"+Short.MAX_VALUE);
		System.out.println("mInValue:"+Short.MIN_VALUE);
		System.out.println();

		//Integer intNumber=new Integer(10);
		Integer intNum=10;
		System.out.println("Integer Wrapper Class:");
		System.out.println("entered value is:"+intNum);
		System.out.println("Binary:"+Integer.toBinaryString(intNum));
		System.out.println("octal:"+Integer.toOctalString(intNum));
		System.out.println("hexadecimal:"+Integer.toHexString(intNum));
		System.out.println("maxValue:"+Integer.MAX_VALUE);
		System.out.println("mInValue:"+Integer.MIN_VALUE);
		System.out.println();
		
		Long longNum=10000l;
		System.out.println("Long Wrapper Class:");
		System.out.println("entered value is:"+longNum);
		System.out.println("Binary:"+ Long.toBinaryString(intNum));
		System.out.println("octal:"+ Long.toOctalString(intNum));
		System.out.println("hexadecimal:"+ Long.toHexString(intNum));
		System.out.println("maxValue:"+Long.MAX_VALUE);
		System.out.println("mInValue:"+Long.MIN_VALUE);
		
		Float floatNum = 0.3f;
		System.out.println("Float Wrapper Class:");
		System.out.println("entered value is:"+ floatNum);
		System.out.println("maxValue:"+Float.MAX_VALUE);
		System.out.println("mInValue:"+Float.MIN_VALUE);
		System.out.println();

		Double doubleNum = 20.256;
		System.out.println("Double Wrapper Class:");
		System.out.println("Value: " + doubleNum);
		System.out.println("Exponent: " + Double.toHexString(doubleNum));
		System.out.println("Max Value: " + Double.MAX_VALUE);
		System.out.println("Min Value: " + Double.MIN_VALUE);
		System.out.println("NaN: " + Double.isNaN(doubleNum));
		System.out.println();

		Character charValue = 'Z';
		System.out.println("Character Wrapper Class:");
		System.out.println("Value: " + charValue);
		System.out.println("Unicode: " + Character.getNumericValue(charValue));
		System.out.println("Is Digit: " + Character.isDigit(charValue));
		System.out.println("Is Letter: " + Character.isLetter(charValue));
		System.out.println();


		Boolean boolValue = true;
		System.out.println("Boolean Wrapper Class:");
		System.out.println("Value: " + boolValue);
		System.out.println("Logical NOT: " + Boolean.logicalXor(boolValue, boolValue));
		System.out.println("Logical AND: " + Boolean.logicalAnd(boolValue, true));
		System.out.println("Logical OR: " + Boolean.logicalOr(boolValue, false));

	}
}
