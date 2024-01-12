package que3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//3. Create a new list of prime numbers from a list of random numbers (up to 1000) 
//   using streams

public class ListOfPrimeNumbers {
	public static void main(String[] args) {
		ListOfPrimeNumbers l = new ListOfPrimeNumbers();
		Random r = new Random();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i <= 1000; i++) {
			if(l.isPrime(i)) {
				list.add(r.nextInt(1000));
			}
		}
		list.stream().filter(i -> l.isPrime(i)).forEach((e) -> System.out.println(e));

	}
	boolean isPrime(int num) {
		if(num == 1 || num == 0) {
			return false;
		}
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
