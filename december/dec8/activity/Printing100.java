package activity;

public class Printing100 {

	public static void main(String[] args) {
		Printing1to100 printing = () -> {
			for(int i = 1; i <=100; i++) {
				System.out.println(i);
			}
		};
		printing.print();
	}

}