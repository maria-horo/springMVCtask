package nov6monday;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void prime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int i;
		int flag=0;
		if(n==0 || n==1) {
			System.out.println(n+" is not a prime number");
		}
		else{
			for(i=2; i<=n/2; i++) {
				if(n%i==0) {
					System.out.println(n+" is not a prime number");
					flag=1;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println(n+" is a prime number");
		}
		sc.close();
	}
	public static void main(String[] args) {
		prime();
	}
}
