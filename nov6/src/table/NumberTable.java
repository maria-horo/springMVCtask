package table;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int number1 = s.nextInt();//column
		System.out.println("Enter the second number:");
		int number2 = s.nextInt();//rows
		
		for(int input1 = 1; input1<=number2; input1++) {
			for(int input2 = 1; input2<=number1; input2++) {
				int output = input2*input1;
				System.out.print(input1+"X"+input2 +"="+ output+" ");
						
			}
			System.out.println();
		}
		s.close();
	}
}
