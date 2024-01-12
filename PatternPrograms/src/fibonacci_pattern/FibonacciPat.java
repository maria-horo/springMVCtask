package fibonacci_pattern;

public class FibonacciPat {
	public void fibpat() {
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1+" "+num2);
		int num3 = 0;
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=10; j++) {
				for(int k=1; k<=5; k++) {
					num3 = num2 + num1;
					System.out.print(num3+" ");
					num1 = num2;
					num2 = num3;
				}
				break;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		FibonacciPat fib = new FibonacciPat();
		fib.fibpat();
		}
}
