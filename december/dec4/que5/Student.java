package que5;
//5. Write a program to add Student elements (duplicate) to set objects and 
//   display the elements in Sort order

public class Student implements Comparable<Student>{
	private Integer id;
	private String name;
	public Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student s) {
		return this.id - s.id;
	}
}
