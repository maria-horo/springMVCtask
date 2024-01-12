package nov22_case5;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Parent p = new Child();
		try {
			p.method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
