package nov16Que5_6;
//5. Declare functions in an interface with all access
//modifiers and give implementation for them in subclasses.

public interface Person {
	public void walk();
	//protected void eat(); -- Illegal modifier
	void sleep();
	//private void instagram(); -- Illegal modifier
	abstract void work();
	default void play() {
		//need to provide body for default methods or else
		//compile time ERROR
	}
//	strictfp void dance() {
//
//	}--ERROR
}
