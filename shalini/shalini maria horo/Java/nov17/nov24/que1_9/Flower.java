package que1_9;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 1. Convert string characters to char array and then display them.
   2. Write a program to get substring “CoreNuts Technologies“ from “CoreNuts
      Technologies Pvt ltd.”;
   3. Write a program to compare address of string objects
   4. Write a program to compare string values instead of address of string objects
   5. Write a program to reverse a string “CoreNuts Technologies Pvt ltd.” in different
      ways (on only string object)
   6. Write a program to reverse words instead of characters ““CoreNuts Technologies
      Pvt ltd.”
   7. Write a program to split a string and display tokenized strings
 */

public class Flower {
	void method1() {
		String string = "Sunflower";
		char[] ch = string.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+","+" ");
		}
		System.out.println();
		//		System.out.println(Arrays.toString(ch));
	}

	void method2() {
		String string = "CoreNuts Technologies Pvt ltd";
		String string2 = string.substring(0, 21);
		System.out.println(string2);
	}

	void method3() {
		String s1 = "lily";
		String s2 = new String("lily");
		System.out.println(s1 == s2);
	}

	void method4() {
		String s1 = "tulip";
		String s2 = new String("tulip");
		System.out.println(s1.equals(s2));
	}

	void method5() {
		String s = "CoreNuts Technologies Pvt ltd";
		String reverseString = "";
		char ch;
		for(int i = 0; i< s.length(); i++) {
			ch = s.charAt(i);
			reverseString = ch + reverseString;
		}
		System.out.println(reverseString);
	}

	void reverse(char[] ch, int left, int right) {
		while (left <= right) {
			char temp = ch[right];
			ch[right] = ch[left];
			ch[left] = temp;
			left++;
			right--;
		}
	}
	void method6 () {
		String stringArray = "CoreNuts Technologies Pvt ltd";
		String[] stringArray1=stringArray.split(" ");
		for (int index =stringArray1.length-1; index >=0 ; index--) {
			System.out.print(stringArray1[index]+" ");
		}
		System.out.println();
	}

	void method7() {
		String stringArray = "Chrysanthemums and tulips are beautiful and attractive.";
		String[] stringArray1=stringArray.split(" ");
		for (int index =0; index<stringArray1.length ; index++) {
			System.out.println(stringArray1[index]);
		}
		//		String s = "Chrysanthemums and tulips are beautiful and attractive.";
		//		String[] words = s.split("\\s");
		//		for(int i=0; i<s.length(); i++) {
		//			System.out.println(words);
		//		}
	}
	/*
	 * 8. Write a program using StringBuffer class to delete a String “Technologies” from
          “CoreNuts Technologies Pvt ltd.”

       9. Write a program using StringBuffer class to insert a String “Technologies” after
          CoreNuts in “CoreNuts Pvt ltd.”
	 */
	void method8_9() {
		StringBuffer buffer = new StringBuffer("CoreNuts Technologies Pvt ltd");
		buffer =  buffer.delete(9, 21);
		System.out.println(buffer);
		//StringBuffer & StringBuilder are mutable versions of strings

		buffer = buffer.insert(9, "Technologies");
		System.out.println(buffer);
	}
	
}
