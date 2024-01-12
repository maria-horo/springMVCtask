package que6;
//6. Write a program to show the difference between HashSet and TreeSet

import java.util.Objects;

public class Student implements Comparable<Student> {
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

}
