package que1;

import java.util.stream.IntStream;

//1. write a java program to implement a lambda expression to calculate
//   the sum of all prime numbers in a given range

public class Prime {
	
	public static void main(String[] args) {
		int startRange = 2;
		int endRange = 60;
		int primeSum = calculatePrimeSum(startRange, endRange);
		System.out.println("sum of prime numbers in the range: "+startRange+" and "+endRange+" = "+primeSum);
	}
		public static int calculatePrimeSum(int startRange, int endRange) {
			return IntStream.rangeClosed(startRange, endRange).filter(Prime::isPrime).sum();
	}
		public static boolean isPrime(int number) {
			if(number<=1) {
				return false;
			}
			for(int i = 2; i <= number/2; i++) {
				if(number % i == 0) {
					return false;
				}
			}
			return true;
		}
}
