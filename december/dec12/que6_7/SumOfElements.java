package que6_7;

import java.util.Arrays;
import java.util.List;

//7. Find the sum of all elements in the list. For example, if the input is 1,2,3,4,5, 
//   the output should be 15

public class SumOfElements {
	public static void main(String[] args) {
		List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
		int sum = inputList.stream().mapToInt(Integer::intValue).sum();
		System.out.println("The sum of all elements is: "+sum);
	}
}
