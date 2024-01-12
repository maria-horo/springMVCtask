package activity;

public class MathMain {

	public static void main(String[] args) {
		Calculate c = ((num1, num2) -> {
			int result = num1+num2;
			System.out.println(result);
			return result;
		});
		c.sum(20,10);
		StreamActivity math = new StreamActivity();
		Calculate cal = math::sum;
		cal.sum(20,60);
	}
}
