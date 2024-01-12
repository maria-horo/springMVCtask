package table;

import java.util.Scanner;

public class NumTable {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the number to print table:");
			int num = s.nextInt();
			
			System.out.println("Enter the times you want to print:");
			int times = s.nextInt();
			
			for(int mul=1; mul<=times; mul++) {
				int output = num*mul;
				System.out.println(num+" X "+mul+" = "+ output);
			}
		}
	}
}
