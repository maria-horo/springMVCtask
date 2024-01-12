package nov11_flow_controls;
//5. WAP to accept 3 integer numbers & print max value

import java.util.Scanner;

public class MaxOfThree {
	
	public void max() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second integer number:");
		int num2 = sc.nextInt();
		System.out.println("Enter third integer number:");
		int num3 = sc.nextInt();
		
		if( num1 > num2 && num1 > num3) {
			System.out.println(num1+" is the maximum");
		} else if ( num2 > num1 && num2 > num3 ){
			System.out.println(num2+" is the maximum");
		} else { 
			System.out.println(num3+" is the maximum");
		}
		
//		ternary- largest= c > (a>b ? a:b) ? c:((a>b) ? a:b);  
//		int maximum = num3 > (num1>num2 ? num1:num2) ? num3 : ((num1>num2) ? num1:num2);
//		System.out.println(maximum+" is maximum");
		
		sc.close();
	}
	
	public static void main(String[] args) {
		MaxOfThree maxThree = new MaxOfThree();
		maxThree.max();
	}
}
