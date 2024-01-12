package dec11_lecture;

import java.util.Optional;

//optional class
public class OptionalTest {

	public static void main(String[] args) {
		Optional<String> optional = Optional.ofNullable(null);
		//Optional<String> optional = Optional.of(null);
		System.out.println(optional.isPresent());
		
		String txt = optional.orElseThrow(() -> new IllegalArgumentException("text is required"));
		System.out.println(txt.toUpperCase());
		
//		if(optional.isPresent()) {
//			System.out.println(optional.get().toUpperCase());
//		}
//		else {
//			System.out.println("null value");
//		}
	}
}
