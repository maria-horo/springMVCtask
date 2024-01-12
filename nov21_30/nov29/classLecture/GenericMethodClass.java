package classLecture;

public class GenericMethodClass {
	public <T>void calculate(GenericKlass<T> value1, GenericKlass<T> value2){
		System.out.println(value1);
		System.out.println(value2);
	}
	public <T>void calculate(T value1, T value2){
		System.out.println(value1);
		System.out.println(value2);
	}

	public static void main(String[] args) {

		GenericMethodClass klass = new GenericMethodClass();
		GenericKlass<Integer> object1 = new GenericKlass<>();
		GenericKlass<Integer> object2 = new GenericKlass<>();

		klass.<String>calculate("String1", "String2");
		klass.<Integer>calculate(object1, object2);
	}
}
