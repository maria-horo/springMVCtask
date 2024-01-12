package nov11_flow_controls;
//1. 1.	Write a program to print Non-prime numbers from 1 to 100 
//using for, while and do-while loop

public class NonPrime {
	//FOR LOOP
	void isNotPrimeUsingFor()
	{
		for(int value1=2;value1<=100;value1++)
		{
			int count =0;
			for(int value2=1;value2<=value1;value2++)
			{
				if(value1%value2==0)
				{
					count++;
				}
			}
			if(count>2)
			{
				System.out.println(value1);
			}
		}
	}


	//WHILE LOOP
	void isNotPrimeUsingWhile()
	{
		int num=2;
		while(num<=100)
		{
			if(isNotPrime(num))
			{
				System.out.println(num+" ");
			}
			num++;
		}
	}

	private boolean isNotPrime(int num) {
		if(num<=1) {
			return false;
		}
		int divisor=2;
		while(divisor<=Math.sqrt(num)) {
			if(num%divisor==0)
			{
				return true;
			}
			divisor++;
		}
		return false;
	}

	// DO WHILE LOOP
	void isNotPrimeUsingDoWhile()
	{
		int num=2;
		do {
			if(!isNotPrime1(num)) {
				System.out.println(num);
			}
			num++;


		}
		while(num<=100);
	}

	private boolean isNotPrime1(int num1) {
		if(num1<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(num1);i++)
		{
			if(num1%i==0)
			{
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
		NonPrime nonPrime = new NonPrime();
		nonPrime.isNotPrimeUsingFor();
		nonPrime.isNotPrimeUsingWhile();
		nonPrime.isNotPrimeUsingDoWhile();
	}

}
