package que1;

import java.util.HashMap;
import java.util.Map;

/*1. Write a program to find the count of each word in a given String value.
     String str = "Core nuts technologies located in Bangalore Core nuts 
     technologies located in hyderabad Core nuts technologies in Hyderabad 
     Core nuts technologies in Bangalore";
     Expected output is
          Core - 4
          nuts - 4
          technologies - 4
          located - 2
          in - 4
          Bangalore - 2
          Hyderabad - 1
          hyderabad - 1
*/
public class CountOfString {
	Map<String, Integer> countWords(String s){
		Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
		String[] stringArray = s.split(" ");
		for(String word : stringArray) {
			System.out.printf(word, wordCountMap.getOrDefault(word, 0)+1);
		}
		return wordCountMap;
	}
	public static void main(String[] args) {
		CountOfString c = new CountOfString();
		String str = "Core nuts technologies located in Bangalore Core nuts technologies located in hyderabad Core nuts technologies in Hyderabad Core nuts technologies in Bangalore";
		
		Map<String, Integer>map = c.countWords(str);
		for(Map.Entry<String, Integer> entry : map.entrySet() ) {
			System.out.println(entry.getKey() + "-" +entry.getValue());
		}
	}
}
