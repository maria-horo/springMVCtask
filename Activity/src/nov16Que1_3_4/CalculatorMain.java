package nov16Que1_3_4;
//1. Declare an interface with calculate function and
//give the implementation for that in subclasses and 
//show the result through subclass objects.


public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calci = new CalculatorSubClass();
		calci.calculate();
	}
}
