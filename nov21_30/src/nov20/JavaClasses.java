package nov20;

import java.util.Scanner;

public class JavaClasses implements ExceptionInterface {

//1. Write a program to throw checked exceptions using throw and throws
//	 (using throw)
	
	public void marriageAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your GENDER: f or m");
		char gender = sc.next().charAt(0);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();

		if( gender == 'f' ) {
			if( age >= 18 ) {
				System.out.println("Congrats! you're eligible for marriage.");
			} else {
				String message = "Not Eligible";
				throw new NotEligibleForMarriageException(message);
			}
		}
		else if ( gender == 'm') {
			if(age >= 21 ) {
				System.out.println("You're eligible man!");
			} else {
				String message = "Wait macha! You're Not Eligible";
				throw new NotEligibleForMarriageException(message);
			}
		}
		else {
			System.out.println("Invalid gender type");
		}
	}

//1.  (using throws)	
	public void voteEligibility() throws InvalidAgeException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();

		if(age < 18){   
			throw new InvalidAgeException("age is not valid to vote");
		}  else {   
			System.out.println("welcome to vote");   
		}
	}

	//4
	public void nestedTry() {
		try {
			try {
				int divide = 10/0;
				System.out.println(divide);
			} catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			try {
				int[] array = {4, 5, 2};
				System.out.println(array[5]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	//5. Write a program to re-throw same exception from catch block
	public void reThrowException(int n1, int n2) {
		try{
			System.out.println(n1/n2);
		}catch(ArithmeticException e){
			throw e; 
		}
	}
	
//	public int add() {
//		int n = 10;
//		int m = 20;
//		return n+m;
//	}
}
