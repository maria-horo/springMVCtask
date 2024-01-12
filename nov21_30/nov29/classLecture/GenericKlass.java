package classLecture;

public class GenericKlass<T> {
	private T name;
	private T location;

	public T getName() {
		return name;	
	}
	public void setName(T name) {
		this.name = name;
	}
	public T getLocation() {
		return location;
	}
	public void set(T location) {
		this.location = location;
	}
}
