package que6_7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//6. Add 5 to each element in the integer list. For example, if the input is 
//   1,2,3,4,5, the output should be 6,7,8,9,10

public class Adding5ToElements {
	public static void main(String[] args) {
		List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> outputList = inputList.stream().map(num -> num + 5).collect(Collectors.toList());
		System.out.println(outputList);
	}
}
