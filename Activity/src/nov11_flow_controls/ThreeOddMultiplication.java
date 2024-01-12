package nov11_flow_controls;
//3. Write a program to print 3 multiplication program and skip the 
//   even number in the output using while, do-while and loop. 
//   Excepted Output: 3,9,15,21….

public class ThreeOddMultiplication {
	void usingForLoop() {
		for(int i = 3; i<=100; i++) {
			if(i%3==0 && i%2!=0) {
				System.out.println(i);
			}
		}
	}

	void usingWhileLoop() {
		int num = 3;
		while(num%3==0 && num<100) {
			if(num%2!=0) {
				System.out.println(num);
			}
			num=num+3;
		}
	}

	void usingDoWhileLoop() {
		  int multiplier = 3;
	       int i = 1;

	       do {
	           int result = multiplier * i;

	           // Skip even numbers
	           if (result % 2 != 0) {
	               System.out.println(result);
	           }

	           i++;
	       } while (i <= 10);

	}

	public static void main(String[] args) {
		ThreeOddMultiplication oddmultiplication = new ThreeOddMultiplication();
		oddmultiplication.usingForLoop();
		oddmultiplication.usingWhileLoop();
		oddmultiplication.usingDoWhileLoop();
	}

}
