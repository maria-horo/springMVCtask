package que11;
//11. Write a program to count repeated characters in a string.

public class RepeatedChars {
	void countOfRepeated() {
		String str = "I need to learn Git";
		char[] string = str.toCharArray();
		int count = 0;

		for(int i = 0; i < string.length; i++) {
			for(int j = i+1; j< string.length; j++) {
				if(string[i] == string[j] && string[i] != ' ') {
					count++;
					string[j] = 0;
				}
			}
			if(count > 1 && string[i] != 0) {
				System.out.println(string[i]);
			}
			System.out.println(string[i]);
		}
	}
}
