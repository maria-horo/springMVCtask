package nov22_case4;

public class Main {

	public static void main(String[] args) {
		Parent p = new Child();
		try {
			p.method();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
