package que3;

public class CurrentThreadMain {

	public static void main(String[] args) {
		CurrentThreadName thread1 = new CurrentThreadName();
		thread1.start();
		System.out.println(Thread.currentThread().getName()+" yo");
	}

}
