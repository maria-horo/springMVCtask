package que4;
//4. show the behavior of thread by influencing thread functions 
//   (sleep, join, yield)

public class JavaSleep extends Thread {
	//these methods are used to prevent thread execution
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("sleep thread");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
