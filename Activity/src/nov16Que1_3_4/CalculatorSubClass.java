package nov16Que1_3_4;

public class CalculatorSubClass implements Calculator{

	public void calculate() {
		int value1 = 10;
		int value2 = 20;
		int multiplication = value1 * value2;
		System.out.println("Multiplication of "+value1+" and "+value2+" is "+multiplication);
	}

}
