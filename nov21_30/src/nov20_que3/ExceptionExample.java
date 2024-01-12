package nov20_que3;

public class ExceptionExample implements ExceptionInCatchInterface {

	public void exceptionCatch() {
		try {
			int result = 10/0;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			try {
				String message = "undefined";
				throw new UserDefinedException(message);
			} catch (UserDefinedException ude) {
				System.out.println(ude.getMessage());
			}
		}
	}
}
