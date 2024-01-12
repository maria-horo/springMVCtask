package que1;

public class Factorial {

	void factorialValue(int number) {
		int factorial = 1;
		for(int num = number; num > 1; num--) {
			factorial = num * factorial;
			System.out.print(num + "x");
		}
		System.out.print("1="+" "+factorial);
	}
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		factorial.factorialValue(5);
	}
}
