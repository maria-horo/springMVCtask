package nov16AbstractInterfaceQue2;

public class Dog implements Animal {

	@Override
	public void noise() {
		System.out.println("Dog is barking...");	
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating chicken...");
	}
}
