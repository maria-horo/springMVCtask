package que5;
//5.Write a program to initialize static variables through constructor and print them

public class Flower {
	static String name;
	static String color;
	Flower(String name, String color){
		Flower.name = name;
		Flower.color = color;
	}
	public String toString() {
		return "Flower NAME: "+name+"  COLOR: "+color;
	}
}
