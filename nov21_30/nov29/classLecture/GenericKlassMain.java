package classLecture;

public class GenericKlassMain {

	public static void main(String[] args) {
		GenericKlass<String> generic = new GenericKlass<>();
		generic.setName("momo");
		System.out.println(generic.getName());

	}

}
