package que2;

public class ClassMain {

	public static void main(String[] args) {
		ThreadClass thread1 = new ThreadClass();
		thread1.start();
		
		RunnableClass runnable = new RunnableClass();
		Thread thread2 = new Thread(runnable);
		thread2.start();
	}

}
