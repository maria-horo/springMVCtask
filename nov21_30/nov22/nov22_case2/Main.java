package nov22_case2;

public class Main {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.method();	
	}

	/*
	 * If super class method does not declare an exception, subclass overridden method
	 * cannot declare checked exception but can declare unchecked exception.
	 */
}
