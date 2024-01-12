package activity;

import java.util.HashMap;
import java.util.Map;

public class Frequency {

	public static void main(String[] args) {
		String str = "corenuts technologies";
		char[] ch = new char[str.length()];
		Map<Character, Integer>map = new HashMap<Character, Integer>();
		for(int i = 0; i< str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				int count = map.get(str.charAt(i));
				
			}
		}
	}

}
