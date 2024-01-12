package lecture;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> values = new ArrayList<>();
		values.add("one");
		values.add("two");
		values.add("three");
		
		values.forEach((e) -> {
			e = e.toUpperCase();
			System.out.println(e);
		});
		//consumer functional interface
		values.forEach((e) -> System.out.println(e));
	}
}
