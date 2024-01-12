package nov11_flow_controls;
//4. WAP that prints values from 1-100 so that the program exists
//   by using the break keyword at value 47
public class BreakKeyword {
	
	void printingNums() {
		for( int num = 1; num<=100; num++ ) {
			System.out.println(num);
			if(num == 47) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		BreakKeyword breakKeyword = new BreakKeyword();
		breakKeyword.printingNums();
	}

}
