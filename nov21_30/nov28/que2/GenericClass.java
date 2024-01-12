package que2;

import java.util.ArrayList;

public class GenericClass<T> implements GenericInterface<T>{

	@Override
	public <T> void generalAdd() {
		ArrayList<T> list = new ArrayList<T>();
		list.add((T) Integer.valueOf(42));
		list.add((T) Integer.valueOf(1));
		list.add((T) Integer.valueOf(2));
		list.add((T) Integer.valueOf(4));
		list.add((T) Integer.valueOf(12));
		for (T t : list) {
			System.out.println(t);
		}
	}

	public <T> void generalAdd1(T value) {
		ArrayList<T> list = new ArrayList<T>();
		list.add(value);
		for (T t : list) {
			System.out.println(t);

		}
	}

	public static void main(String[] args) {
		GenericClass<Integer> genericClass = new GenericClass<Integer>();
		genericClass.<Integer>generalAdd();
		genericClass.<Integer>generalAdd1(10);
	}
}
