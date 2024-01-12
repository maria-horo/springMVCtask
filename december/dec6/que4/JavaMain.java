package que4;

public class JavaMain {

	public static void main(String[] args) {
		JavaSleep j = new JavaSleep();
		j.start();
		j.yield();
		for(int i = 0; i < 10; i++) {
			System.out.println("main thread");
			try {
				j.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
