package nov16AbstractInterfaceQue2;

public class AnimalMain {

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.noise();
		dog.eat();
		
		Fish fish = new FishSubClass();
		fish.eat();
		fish.swim();
		

	}

}
