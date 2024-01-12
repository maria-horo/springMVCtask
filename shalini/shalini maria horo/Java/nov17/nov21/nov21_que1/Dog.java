package nov21_que1;

public class Dog extends Animal{
	
	@Override
	void sleep() {
		System.out.println("Dog is sleeping...");
	}
	@Override
	void eat() {
		System.out.println("Dog is eating...");
	}
}
