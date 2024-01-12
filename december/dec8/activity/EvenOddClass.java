package activity;

public class EvenOddClass {

	//	@Override
	//	public boolean check(int num){
	//		if(num % 2 == 0) {
	//			return true;
	//		}
	//		return false;	
	//	}
	public static void main(String[] args) {
		NumberEvenOrOdd evenOdd = (num) -> 
			/*
			 * if(num % 2 == 0) { return true; }
			return false; */
			num%2==0;
		
		System.out.println(evenOdd.check(11));
	}
}
