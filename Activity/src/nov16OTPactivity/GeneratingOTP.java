package nov16OTPactivity;

import java.util.Scanner;

public class GeneratingOTP {
	public int digitCount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number atmost 4 digits:");
		int number = sc.nextInt();
		int count = 0;
		while(number>0) {
			number = number/10;
			count++;
		}
		return count;
	}
	public void otpMethod(int num) {
		if(digitCount() == 1) {
			System.out.println(000+""+num);
		}
		else if(digitCount() == 2) {
			System.out.println(00+""+num);
		}
		else if(digitCount() == 3) {
			System.out.println(0+""+num);
		}
		else if(digitCount() == 4) {
			System.out.println(num);
		}
		else {
			System.out.println("invalid");
		}
	}
	public static void main(String[] args) {

		GeneratingOTP otp = new GeneratingOTP();
		otp.digitCount();
		otp.otpMethod(2);
	}
}
