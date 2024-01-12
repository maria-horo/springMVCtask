package que3;
//3. Write a program to display current thread name.

public class CurrentThreadName extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
