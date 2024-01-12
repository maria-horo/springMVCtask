package que5;

//5. Write a program to check given string value is string or number.

public class StringOrNot {

	void check() {
		String string = "123";
        try {
            Integer num = Integer.parseInt(string);
            System.out.println("true");
        } catch (NumberFormatException e) {
        	System.out.println(e.getMessage());
            System.out.println("false");
        }

	}
	public static void main(String[] args) {
		String num = "100";
		Integer n = Integer.parseInt(num);
		System.out.println(n instanceof Integer);
	}
}
