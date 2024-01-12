package nov14;

public class Fibonacci {
	public void fibonacci20() {
		int fibonacci1 = 0;
		int fibonacci2 = 1;
		System.out.print(fibonacci1+" "+fibonacci2);
		int fibonacci3 = 0;
		double sum = 0;
		for(int i = 0; i<=18; i++) {
			fibonacci3 = fibonacci2 + fibonacci1;
			System.out.print(" "+fibonacci3);
			fibonacci1 = fibonacci2;
			fibonacci2 = fibonacci3;
			sum = sum + fibonacci3;
		}
		System.out.println();
		double average = sum/20;
		System.out.println("Average is "+average);
	}

	public static void main(String[] args) {
			Fibonacci fib = new Fibonacci();
			fib.fibonacci20();
	}
}
