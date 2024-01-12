package dec11_lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListTest {

	public static void main(String[] args) {
		List<String> values = new ArrayList<>();
		values.add("one");
		values.add("two");
		values.add("three");
		values.add("four");
		values.add("five");
		values.add("one");
		
		values.forEach((e) -> System.out.println(e));
		
		Optional<String> valueOptional = 
				values.stream().filter((e) -> e.equals("three")).findFirst();
		//findFirst(), findLast(), findAny()		
		String value = valueOptional.orElseThrow(() ->
                         new IllegalArgumentException("no value"));
		System.out.println(value);
		
//		values.stream().sorted().forEach((e) -> {
//			String upperCase = e.toUpperCase();
//			System.out.println(upperCase);
//		});
		
		System.out.println("=====================================");
		List<String> changedList = values.stream().map((e) -> {
			return e.toUpperCase();
		}).collect(Collectors.toList());
		changedList.stream().forEach((e) -> System.out.println(e));
		values.stream().forEach((e) -> System.out.println(e));
		
		List<String> collect = values.stream().filter((e) -> e.equals("one")).collect(Collectors.);
		
	}
}
