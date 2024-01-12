package nov14;
//22

import java.util.Arrays;
import java.util.Random;

public class RandomNumberGenerator {
	public static void main(String[] args) {
		Random random=new Random();
		int [] intArray=new int[25];
		for(int index=0;index<25;index++)
		{
			int value=random.nextInt(1000);
			intArray[index]=value;
		}

		System.out.println(Arrays.toString(intArray));

		int compareValue=intArray[2];

		for(int index2=0;index2<25;index2++)
		{
			if(compareValue>intArray[index2])
			{
				System.out.println(intArray[index2]+" is greater than the second value:"+compareValue);
			}
			else if(compareValue==intArray[index2])
			{
				System.out.println(intArray[index2]+" is equal to second value:"+compareValue);
			}
			else if(compareValue<intArray[index2])
			{
				System.out.println(intArray[index2]+" is less than second value:"+compareValue);
			}
		}
	}
}
