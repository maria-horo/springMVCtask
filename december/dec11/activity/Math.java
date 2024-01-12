package activity;

public class Math {

	public int sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		StreamActivity calci = new  StreamActivity();
		System.out.println(calci.sum(20, 10));			
	}
}
