package nov14;

public class A {

	public A() {
		B b = new B();
		b.method1();
		//b.method2();
		b.method3();
		b.method4();
		method();
	}
	private void method() {
		System.out.println("non static method");
		
	}
	public static void main(String[] args) {
		
		A a = new A();
		
	}
}

