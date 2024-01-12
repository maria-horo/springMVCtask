package nov16Que1_3_4;
//4
public class SymbolOpeation implements Add_Sub, Mul_Div, ResultSymbol{

	@Override
	public void printResult(int res) {
	     System.out.println("The result is: "+ res);
	}

	@Override
	public void mul(int x, int y) {
        int res = x*y;
        printResult(res);
	}

	@Override
	public void div(int x, int y) {
		int res = x/y;
		printResult(res);
	}

	@Override
	public void add(int x, int y) {
		int res = x+y;
		printResult(res);
	}

	@Override
	public void sub(int x, int y) {
        int res = x-y;
        printResult(res);
	}

	
}
