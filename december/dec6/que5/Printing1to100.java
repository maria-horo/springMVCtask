package que5;

public class Printing1to100 extends Thread {
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
