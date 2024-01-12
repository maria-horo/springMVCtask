package nov14;

public class Palindrome {
	public boolean checkPalindrome(int num) {
		int temp = num;
		int sum = 0;
		
		while(num>0) {
			int remainder = num%10;
			sum = (sum*10) + remainder;
			num = num/10;
		}
		if(temp == sum) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		System.out.println(palindrome.checkPalindrome(657));
	}

}
