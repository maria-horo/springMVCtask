package nov15;

public class PlayingWithAccessSpecifiers {
	
	public int age = 23;
	protected char gender = 'f';
	String hairColor = "black";
	private double salary = 3.5;
	
	public void method1() {
		System.out.println("This is first method");
	}
	protected void method2() {
		System.out.println("This is second method");
	}
	void method3() {
		System.out.println("This is third method");
	}
	private void method4() {
		System.out.println("This is fourth method");
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
